import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.util.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.reasoner.ValidityReport;

public class Musica {

    public static void main(String[] args) throws FileNotFoundException {
        
        String data = 
                
            "SELECT *" + 
            "WHERE{" + 
            "?individuo a <http://www.musica.org#Obra> ." + 
            "?individuo <http://www.musica.org#Id_Obra> ?parametro." + 
            "FILTER(?parametro=3097)." + 
            "}";
        
        Query(data);
        //System.out.println(Filter("peso", "<", "50"));
        //System.out.println(Filter("Nombre", "contain", "Hola"));
    }
        
        public static void Query(String data) {
            Model model = ModelFactory.createDefaultModel();
		InputStream in = FileManager.get().open("MusicaRDF.owl");
		model.read(in, null, "RDF/XML");
		String querys;
		querys=         "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +  
		  		"PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
		  		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
		  		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>" + 
		  		"PREFIX m: <http://musica.org#>" + data;
		Query query = QueryFactory.create(querys);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
			ResultSet results =qexec.execSelect();
			while (results.hasNext()){
				QuerySolution soln =results.nextSolution();
                                Literal x = soln.getLiteral("parametro");
                                System.out.println(soln.getResource("individuo") + "\t" + soln.getResource("atributo") + "\t" + x.getString());
			}
		} finally {
			qexec.close();
		}
        }
        
        public static String Filter(String variable, String type, String cond) {
            String filter = "FILTER ";
            if (type.equals("=") || type.equals(">") || type.equals(">=") || type.equals("<") || type.equals("<=") || type.equals("!=")) {
                filter += "(?" + variable + " " + type + " " + cond + ") .";
                return filter;
            } else if(type.equals("contain")) {
                return filter + "regex(?" + variable + ", \"" + cond + "\") .";
            } else {
                return "";
            }
        }

}
