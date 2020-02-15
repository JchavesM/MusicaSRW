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
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.reasoner.ValidityReport;

public class Musica {

	public static void main(String[] args) throws FileNotFoundException {

//                Cargando el modelo turtle/owl
//                Model model = ModelFactory.createDefaultModel();
//                InputStream in = FileManager.get().open("MusicaTT.owl");
//                model.read(in, null, "TURTLE");
//
////                Creando un doc rdf
//                Reasoner RDFSreasoner = ReasonerRegistry.getRDFSReasoner();
//                InfModel RDFSinfe = ModelFactory.createInfModel(RDFSreasoner, model);
//                OutputStream RDFSos = new FileOutputStream("Musica_RDFSreasoner.rdf");
//                RDFSinfe.write(RDFSos, "RDF/XML");
                
                Model model = ModelFactory.createDefaultModel();
		InputStream in = FileManager.get().open("MusicaRDF.owl");
		model.read(in, null, "RDF/XML");
		String querys;
		querys="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
		  		"PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
		  		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
		  		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>" + 
		  		"PREFIX p: <http://musica.org#>" + 
		  		"SELECT *" + 
		  		"WHERE {" + 
		  		"?robot rdfs:subClassOf ?peso." +
		  		"}";
		Query query = QueryFactory.create(querys);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
			ResultSet results =qexec.execSelect();
			while (results.hasNext()){
				QuerySolution soln =results.nextSolution();
				System.out.println(soln);
			}
		} finally {
			qexec.close();
		}
                
	}

}
