import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;

import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.reasoner.ValidityReport;
import org.apache.jena.util.FileManager;
import org.apache.jena.util.iterator.ExtendedIterator;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;

import org.apache.jena.ontology.OntModelSpec;

public class Razonadores {

	public static void main(String[] args)
    {
 	   //validate the program arguments
      
       String inputFileName = "musica.ttl";
       String inputFileFormat = "TURTLE";
       String outputFileName = "musica.txt";
       String reasoningLevel = "none";

       //create an input stream for the input file
       FileInputStream inputStream = null;
       PrintWriter writer = null;
       try 
       {
          inputStream = new FileInputStream(inputFileName);
       } catch (FileNotFoundException e) {
          System.err.println("'" + inputFileName 
             + "' is an invalid input file.");
          return;
       }
       
       //create an output print writer for the results
       try 
       {
          writer = new PrintWriter(outputFileName);
       } catch (FileNotFoundException e) {
          System.err.println("'" + outputFileName 
             + "' is an invalid output file.");
          return;
       }
       
       //create the appropriate jena model
       OntModel model = null;
       if("none".equals(reasoningLevel.toLowerCase()))
       {
          /*
           * "none" is jena model with OWL_DL
           * ontologies loaded and no inference enabled
           */
          model = ModelFactory.createOntologyModel(
             OntModelSpec.OWL_DL_MEM);
       }
       else if("rdfs".equals(reasoningLevel.toLowerCase()))
       {
          /*
           * "rdfs" is jena model with OWL_DL
           * ontologies loaded and RDFS inference enabled 
           */
          model = ModelFactory.createOntologyModel(
             OntModelSpec.OWL_DL_MEM_RDFS_INF); 
       }
       else if("owl".equals(reasoningLevel.toLowerCase()))
       {
          /*
           * "owl" is jena model with OWL_DL ontologies
           * wrapped around a pellet-based inference model
           */
          Reasoner reasoner = 
             ReasonerRegistry.getOWLReasoner();
          Model infModel = ModelFactory.createInfModel(
             reasoner, ModelFactory.createDefaultModel());
          model = ModelFactory.createOntologyModel(
             OntModelSpec.RDFS_MEM, infModel);
       }
       else
       {
          //invalid inference setting
          System.err.println("Invalid inference setting, "
             + "choose one of <none|rdfs|owl>.");
          return;
       }
       
       //load the facts into the model
       model.read(inputStream, null, inputFileFormat);
       
       //validate the file
       ValidityReport validityReport = model.validate();
       if(validityReport != null && !validityReport.isValid())
       {
          Iterator i = validityReport.getReports();
          while(i.hasNext())
          {
             System.err.println(
                ((ValidityReport.Report)i.next()).getDescription());
          }
          return;
       }
       
       //Iterate over the individuals, print statements about them
       ExtendedIterator iIndividuals = model.listIndividuals();
       while(iIndividuals.hasNext())
       {
          Individual i = (Individual)iIndividuals.next();
          printIndividual(i, writer);
       }
       iIndividuals.close();
       
       writer.close();
       model.close();
    }
    
    /**
     * Print information about the individual
     * @param i The individual to output
     * @param writer The writer to which to output
     */
    public static void printIndividual(
       Individual i, PrintWriter writer)
    {
       //print the local name of the individual (to keep it terse)
       writer.println("Individual: " + i.getLocalName());
       
       //print the statements about this individual
       StmtIterator iProperties = i.listProperties();
       while(iProperties.hasNext())
       {
          Statement s = (Statement)iProperties.next();
          writer.println("  " + s.getPredicate().getLocalName() 
             + " : " + s.getObject().toString());
       }
       iProperties.close();
       writer.println();
    }
		
	}
	

