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
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.reasoner.ValidityReport;

public class Musica {

	public static void main(String[] args) throws FileNotFoundException {

//                Cargando el modelo turtle/owl
		Model model = ModelFactory.createDefaultModel();
		InputStream in = FileManager.get().open("MusicaTT.owl");
		model.read(in, null, "TURTLE");

//                Creando un doc rdf
                Reasoner RDFSreasoner = ReasonerRegistry.getRDFSReasoner();
		InfModel RDFSinfe = ModelFactory.createInfModel(RDFSreasoner, model);
		OutputStream RDFSos = new FileOutputStream("Musica_RDFSreasoner.rdf");
		RDFSinfe.write(RDFSos, "RDF/XML");
                

//                Model data = FileManager.get().loadModel("./Musica_RDFSreasoner.rdf");
//                InfModel infmodel = ModelFactory.createRDFSModel(data);
//                ValidityReport validity = infmodel.validate();
//                if (validity.isValid()) {
//                System.out.println("OK");
//                } else {
//                System.out.println("Errores: ");
//                for (Iterator i = validity.getReports(); i.hasNext(); ) {
//                System.out.println(" - " + i.next());
//                }
//                }
                
	}

}
