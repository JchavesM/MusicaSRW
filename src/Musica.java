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

public class Musica {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Model model = ModelFactory.createDefaultModel();
		Model model = ModelFactory.createDefaultModel();
		InputStream in = FileManager.get().open("Data.owl");
		model.read(in, null, "TURTLE");
		
		Reasoner RDFSreasoner = ReasonerRegistry.getRDFSReasoner();
		InfModel RDFSinfe = ModelFactory.createInfModel(RDFSreasoner, model);
		OutputStream RDFSos = new FileOutputStream("Data_RDFSreasoner.rdf");
		RDFSinfe.write(RDFSos, "RDF/XML");
	}

}
