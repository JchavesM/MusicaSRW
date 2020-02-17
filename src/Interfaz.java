/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Andrés Calle
 */

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

public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Musica
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtroEntrada = new javax.swing.JTextField();
        BotonMostrarEntidades = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonInstancias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextSalida = new javax.swing.JTextArea();
        entidadEntrada2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonRelaciones = new javax.swing.JButton();
        botonRelacionesIndirectas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        instanciaEntrada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        atributoEntrada = new javax.swing.JTextField();
        busquedaBotonAtributo = new javax.swing.JButton();
        botonEstadisticas = new javax.swing.JButton();
        botonRelacionDirectaIns = new javax.swing.JButton();
        entidadEntrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        instanciaEntrada2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonRelacionIndirectaIns = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filtroEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroEntradaActionPerformed(evt);
            }
        });

        BotonMostrarEntidades.setText("Mostar entidades disponibles");
        BotonMostrarEntidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarEntidadesActionPerformed(evt);
            }
        });

        jLabel1.setText("Entidad");

        jLabel2.setText("Salida");

        BotonInstancias.setText("Buscar Instancias");
        BotonInstancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInstanciasActionPerformed(evt);
            }
        });

        TextSalida.setColumns(20);
        TextSalida.setRows(5);
        jScrollPane1.setViewportView(TextSalida);

        jLabel3.setText("Filtro");

        BotonRelaciones.setText("Buscar relaciones");
        BotonRelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRelacionesActionPerformed(evt);
            }
        });

        botonRelacionesIndirectas.setText("Buscar relaciones Indirectas");
        botonRelacionesIndirectas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRelacionesIndirectasActionPerformed(evt);
            }
        });

        jLabel4.setText("Instancia");

        jLabel5.setText("Atributo");

        busquedaBotonAtributo.setText("Busqueda con igual valor que atributo");
        busquedaBotonAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaBotonAtributoActionPerformed(evt);
            }
        });

        botonEstadisticas.setText("Estadisticas por atributo");
        botonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadisticasActionPerformed(evt);
            }
        });

        botonRelacionDirectaIns.setText("Relacion directa entre instancias");
        botonRelacionDirectaIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRelacionDirectaInsActionPerformed(evt);
            }
        });

        entidadEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entidadEntradaActionPerformed(evt);
            }
        });

        jLabel6.setText("Segunda Entidad");

        jLabel7.setText("Segunda Instancia");

        botonRelacionIndirectaIns.setText("Relacion indirecta entre instancias");
        botonRelacionIndirectaIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRelacionIndirectaInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entidadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filtroEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(instanciaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(atributoEntrada))))
                            .addComponent(botonRelacionDirectaIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonMostrarEntidades)
                                    .addComponent(botonEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonInstancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonRelaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonRelacionesIndirectas, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busquedaBotonAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botonRelacionIndirectaIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entidadEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(instanciaEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instanciaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atributoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entidadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMostrarEntidades)
                    .addComponent(BotonInstancias)
                    .addComponent(busquedaBotonAtributo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRelaciones)
                    .addComponent(botonEstadisticas)
                    .addComponent(botonRelacionesIndirectas))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instanciaEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonRelacionDirectaIns))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entidadEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRelacionIndirectaIns)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMostrarEntidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarEntidadesActionPerformed
           String entidades[];
           String salida = "";
           TextSalida.setText("");
           entidades = new String[]{"Genero", "Obra", "Persona","Cantante", "Compositor"} ;
           for ( int i = 0;  i <= entidades.length - 1; i++){
               TextSalida.append(entidades[i] + "\n\r");
           }           
           
    }//GEN-LAST:event_BotonMostrarEntidadesActionPerformed

    private void BotonInstanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInstanciasActionPerformed
        String entidad = entidadEntrada.getText();
        String atributo = atributoEntrada.getText();
        String filtro = filtroEntrada.getText();
        TextSalida.setText("");      
        
        if (filtroEntrada.getText() == null || filtroEntrada.getText().trim().isEmpty() ){
            
            String data =   "SELECT DISTINCT *" + 
                            "WHERE " + 
                            "{ " + 
                            "?entidad a <http://www.musica.org#"+ entidad +"> ." + 
                            "?entidad ?atributo ?valor ." + 
                            "?atributo a owl:DatatypeProperty ." + 
                            "" + 
                            "" + 
                            "} ORDER BY ?entidad"

                            + 
                            "";
           Query1(data);
        }
        else{
            String data =   "SELECT DISTINCT * " + 
                            "WHERE " + 
                            "{ " + 
                            "?entidad a <http://www.musica.org#"+ entidad +"> ." + 
                            "?entidad ?atributo ?valor ." + 
                            " ?atributo a owl:DatatypeProperty ." + 
                            "" + 
                            "" +
                            "FILTER REGEX(?valor ,\""+ atributo +"\")" + 
                            "}"

                            + 
                            "";
            Query1(data);
        }
    }//GEN-LAST:event_BotonInstanciasActionPerformed

    private void BotonRelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRelacionesActionPerformed
        TextSalida.setText("");
        String entidad = entidadEntrada.getText();
        String instancia = instanciaEntrada.getText();
        
    }//GEN-LAST:event_BotonRelacionesActionPerformed

    private void botonRelacionesIndirectasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRelacionesIndirectasActionPerformed
        TextSalida.setText("");
        String entidad = entidadEntrada.getText();
        String instancia = instanciaEntrada.getText();
        
        String data =   "SELECT DISTINCT *" + 
                        "WHERE { ?x a owl:Class ." + 
                        "?y rdfs:subClassOf ?x ." + 
                        "?instancia a ?y ." + 
                        "?instancia <http://www.musica.org#Apodo> ?apodo" + 
                        "}";
        
        if (entidad.toLowerCase().equals("persona")){
            Query4(data);
        }
    }//GEN-LAST:event_botonRelacionesIndirectasActionPerformed

    private void busquedaBotonAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaBotonAtributoActionPerformed
        TextSalida.setText("");
        String entidad = entidadEntrada.getText();
        String instancia = instanciaEntrada.getText();
        String atributo = atributoEntrada.getText();
        
        String data = 
                
            "SELECT *" + 
            "WHERE{" + 
            "?individuo a <http://www.musica.org#"+ entidad +"> ." + 
            "?individuo <http://www.musica.org#"+ instancia +"> ?parametro." + 
            "FILTER REGEX(?parametro, \"" + atributo + "\")." + 
            "}";
        
        Query2(data);
        //System.out.println(Filter("peso", "<", "50"));
        //System.out.println(Filter("Nombre", "contain", "Hola"));
        
    }//GEN-LAST:event_busquedaBotonAtributoActionPerformed

    private void botonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadisticasActionPerformed
        TextSalida.setText("");
        String entidad = entidadEntrada.getText();
        String atributo = atributoEntrada.getText();
        String filtro = filtroEntrada.getText();
        if (filtroEntrada.getText() == null || filtroEntrada.getText().trim().isEmpty() ){
            TextSalida.append(entidad + "\n\r");
            TextSalida.append("Sin filtro");      
        }
        else{
            TextSalida.append(entidad + "\n\r");
            TextSalida.append("Con filtro");
        }
    }//GEN-LAST:event_botonEstadisticasActionPerformed

    private void botonRelacionDirectaInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRelacionDirectaInsActionPerformed
        TextSalida.setText("");
        String entidad = entidadEntrada.getText();
        String instancia = instanciaEntrada.getText();
        String entidad2 = entidadEntrada2.getText();
        String instancia2 = instanciaEntrada2.getText();
        
       String data = 
                        "     ASK WHERE { " + 
                        "     ?entidad a <http://www.musica.org#"+ entidad +"> ." + 
                        "     ?entidad ?x ?y." + 
                        "     FILTER REGEX(?y, \""+ instancia +"\")." + 
                        "     ?entidad2 a <http://www.musica.org#"+ entidad2 +"> ." + 
                        "     ?entidad2 ?z ?w." + 
                        "     FILTER REGEX(?w, \""+ instancia2 +"\")" + 
                        "     " + 
                        "}";
       System.out.println(data);
       Query3(data);
        
    }//GEN-LAST:event_botonRelacionDirectaInsActionPerformed

    private void botonRelacionIndirectaInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRelacionIndirectaInsActionPerformed
        TextSalida.setText("");
        String entidad = entidadEntrada.getText();
        String instancia = instanciaEntrada.getText();
        String entidad2 = entidadEntrada2.getText();
        String instancia2 = instanciaEntrada2.getText();
    }//GEN-LAST:event_botonRelacionIndirectaInsActionPerformed

    private void filtroEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroEntradaActionPerformed

    private void entidadEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entidadEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entidadEntradaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
        public void Query1(String data) {
            Model model = ModelFactory.createDefaultModel();
		InputStream in = FileManager.get().open("MusicaRDF.owl");
		model.read(in, null, "RDF/XML");
		String querys;
		querys=         "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +  
		  		"PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
		  		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
		  		"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>" + 
		  		"PREFIX p: <http://musica.org#>" + data;
		Query query = QueryFactory.create(querys);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
			ResultSet results =qexec.execSelect();
			while (results.hasNext()){
				QuerySolution soln =results.nextSolution();
                                Literal x = soln.getLiteral("valor");
                                TextSalida.append(soln.getResource("entidad") + "\t" + soln.getResource("atributo") + "\t" + x.getString()+ "\n");
			}
		} finally {
			qexec.close();
		}
        }
    
    public void Query2(String data) {
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
                                TextSalida.append(soln.getResource("individuo") + "\t" + x.getString()+"\n");
			}
		} finally {
			qexec.close();
		}
        }
    
        public void Query3(String data) {
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
			boolean resultado = qexec.execAsk();
                        if (resultado){
                            TextSalida.append("Hay relacion");
                        }
                        else{
                            TextSalida.append("No hay relacion");
                        }
		} finally {
			qexec.close();
		}
        }
        
        public void Query4(String data) {
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
                                Literal x = soln.getLiteral("apodo");
                                TextSalida.append(soln.getResource("instancia") + "\t" + x.getString() + "\n");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInstancias;
    private javax.swing.JButton BotonMostrarEntidades;
    private javax.swing.JButton BotonRelaciones;
    private javax.swing.JTextArea TextSalida;
    private javax.swing.JTextField atributoEntrada;
    private javax.swing.JButton botonEstadisticas;
    private javax.swing.JButton botonRelacionDirectaIns;
    private javax.swing.JButton botonRelacionIndirectaIns;
    private javax.swing.JButton botonRelacionesIndirectas;
    private javax.swing.JButton busquedaBotonAtributo;
    private javax.swing.JTextField entidadEntrada;
    private javax.swing.JTextField entidadEntrada2;
    private javax.swing.JTextField filtroEntrada;
    private javax.swing.JTextField instanciaEntrada;
    private javax.swing.JTextField instanciaEntrada2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
