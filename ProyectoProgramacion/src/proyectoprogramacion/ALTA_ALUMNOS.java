
package proyectoprogramacion;

import alumno.Alumno;
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import metodos.Metodos;
import java.awt.Desktop;
import java.io.File;
import java.lang.System.Logger;
import java.util.logging.Level;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import com.itextpdf.text.DocumentException;
import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;







public class ALTA_ALUMNOS extends javax.swing.JInternalFrame {
     Alumno alumno = new Alumno();
    Metodos metodos= new Metodos();
    DefaultTableModel mdlTabla;
    Vector vColumnas =new Vector();
   
        // Constructor de la clase
    public ALTA_ALUMNOS() {
        initComponents();
             // Establecer el tamaño y título del formulario
        this.setSize(new Dimension(831, 604));
        this.setTitle("alta_alumnos");
            // Configurar la tabla
        vColumnas.addElement("NOMBRE");
        vColumnas.addElement("APELLIDO1");
        vColumnas.addElement("APELLIDO2");
        vColumnas.addElement("DNI");
        vColumnas.addElement("CURSO");
        mdlTabla =new DefaultTableModel(vColumnas,0);
        jTable2.setModel(mdlTabla);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnLIMPIAR = new javax.swing.JButton();
        btnABRIR_PDF = new javax.swing.JButton();
        btnGENERAR_PDF = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setClosable(true);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(783, 738));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("ALTA DE ALUMNOS EN LA CLASE DE INFORMATICA ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("NOMBRE:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("APELLIDO 1:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("APELLIDO 2 :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("DNI:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("CURSO:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnVolver.setBackground(new java.awt.Color(153, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-volver-50.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLIMPIAR.setBackground(new java.awt.Color(153, 255, 255));
        btnLIMPIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-limpiar-50.png"))); // NOI18N
        btnLIMPIAR.setBorder(null);
        btnLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIMPIARActionPerformed(evt);
            }
        });

        btnABRIR_PDF.setBackground(new java.awt.Color(153, 255, 255));
        btnABRIR_PDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-pdf-2-48.png"))); // NOI18N
        btnABRIR_PDF.setText("ABRIR ");
        btnABRIR_PDF.setBorder(null);
        btnABRIR_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABRIR_PDFActionPerformed(evt);
            }
        });

        btnGENERAR_PDF.setBackground(new java.awt.Color(153, 255, 255));
        btnGENERAR_PDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-exportar-pdf-80.png"))); // NOI18N
        btnGENERAR_PDF.setText("GENERAR PDF");
        btnGENERAR_PDF.setBorder(null);
        btnGENERAR_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENERAR_PDFActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(153, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-50.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCurso)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLIMPIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnABRIR_PDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnGENERAR_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLIMPIAR)
                                .addGap(13, 13, 13)
                                .addComponent(btnABRIR_PDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGENERAR_PDF))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(55, 55, 55))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 840, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
             // Obtener los datos ingresados por el usuario
        mdlTabla = new DefaultTableModel();
        String nombre= txtNombre.getText();
        String Apellido1= txtApellido1.getText();
        String Apellido2= txtApellido2.getText();
        String DNI= txtDNI.getText();
        String Curso= txtCurso.getText();
        
        
         // Establecer los datos del alumno
        alumno.setNombre(nombre);
        alumno.setApellido1(Apellido1);
        alumno.setApellido2(Apellido2);
        alumno.setDNI(DNI);
        alumno.setCurso(Curso);
        
        // Guardar el alumno y actualizar la tabla
        metodos.guardar(alumno);
        metodos.guardarArchivo(alumno);
        
        JOptionPane.showMessageDialog(null, "REGISTRO CORRECTO");
        // Limpiar los campos
       txtNombre.setText("");
       txtApellido1.setText("");
       txtApellido2.setText("");
       txtDNI.setText("");
       txtCurso.setText("");
            // Actualizar la tabla con los nuevos datos
       jTable2.setModel(metodos.listaAlumno());
       
    }//GEN-LAST:event_btnAgregarActionPerformed
          // Método para generar un archivo PDF con los datos del alumno
    
    public void generar(String ALTA_ALUMNOS) throws FileNotFoundException, DocumentException{      
           // Verificar que se hayan ingresado todos los campos
        if (!(txtNombre.getText().isEmpty() || txtApellido1.getText().isEmpty() || txtApellido2.getText().isEmpty() || txtDNI.getText().isEmpty() || txtCurso.getText().isEmpty())) {
         // Crear el archivo PDF
        FileOutputStream archivo = new FileOutputStream(ALTA_ALUMNOS + ".pdf");
        com.itextpdf.text.Document documento = new com.itextpdf.text.Document(); // Importa correctamente Document de itextpdf
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        documento.add(new Paragraph("\n"));
        
               // Agregar el contenido al PDF
        Paragraph parrafo = new Paragraph("ALTA DE ALUMNOS");
        parrafo.setAlignment(Paragraph.ALIGN_CENTER); // Usa Paragraph.ALIGN_CENTER en lugar de 1 para el centrado
        documento.add(parrafo);

        documento.add(new Paragraph("Nombre: " + txtNombre.getText()));
        documento.add(new Paragraph("Apellido1: " + txtApellido1.getText()));
        documento.add(new Paragraph("Apellido2: " + txtApellido2.getText()));
        documento.add(new Paragraph("DNI: " + txtDNI.getText()));
        documento.add(new Paragraph("Curso: " + txtCurso.getText()));
        documento.close();

        JOptionPane.showMessageDialog(null, "Archivo PDF creado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para poder continuar", "Atención", JOptionPane.WARNING_MESSAGE);
    }
        }




    
    // Método para abrir un archivo PDF
        public void abrir(String ALTA_ALUMNOS){
            try{
                File path =new File(ALTA_ALUMNOS+".pdf");
                Desktop.getDesktop().open(path);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex,"Atencion",2);
            }
}

        // Método para manejar el evento de volver
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

      // Método para manejar el evento de generar un PDF
    private void btnGENERAR_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENERAR_PDFActionPerformed
        
   try {
        generar(txtNombre.getText());
    } catch (FileNotFoundException ex) {
        ex.printStackTrace(); // Imprime la traza del error en la consola
        JOptionPane.showMessageDialog(null, "Error: Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (DocumentException ex) {
        ex.printStackTrace(); // Imprime la traza del error en la consola
        JOptionPane.showMessageDialog(null, "Error al generar el PDF", "Error", JOptionPane.ERROR_MESSAGE);
    }




    }//GEN-LAST:event_btnGENERAR_PDFActionPerformed

     // Método para manejar el evento de abrir un PDF
    private void btnABRIR_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABRIR_PDFActionPerformed
        // TODO add your handling code here:
        if(!txtNombre.getText().isEmpty())
            abrir(txtNombre.getText());
        else
            JOptionPane.showMessageDialog(null, " **campo vacio\n ** no se enceuntra el archivo con ese nombre","Atencion",2);
    }//GEN-LAST:event_btnABRIR_PDFActionPerformed

      // Método para manejar el evento de limpiar los campos
    private void btnLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPIARActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtDNI.setText("");
        txtCurso.setText("");
    }//GEN-LAST:event_btnLIMPIARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABRIR_PDF;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGENERAR_PDF;
    private javax.swing.JButton btnLIMPIAR;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
