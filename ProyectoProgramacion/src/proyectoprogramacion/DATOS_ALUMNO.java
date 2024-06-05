
package proyectoprogramacion;


import controlador.Ctrl_CursoAlumno;
import modelo.Usuario;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import conexion.conexion; 
import java.nio.file.Paths;
public class DATOS_ALUMNO extends javax.swing.JInternalFrame {

    
    public DATOS_ALUMNO() {
        initComponents();
        this.setSize(new Dimension(700, 480)); // Establece el tamaño de la ventana
        this.setTitle("datos_alumnos"); // Establece el tamaño de la ventana
           // Carga datos en los ComboBox para Curso y Colegio
        this.CargarComboBoxCurso();
        this.CargarComboBoxColegio();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        btnMatricular1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxColegio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("APELLIDOS:");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE:");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("CURSO QUE VA A DAR:");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-mensaje-de-telefono-64.png"))); // NOI18N
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txtApe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 235, -1));

        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 233, -1));

        txtTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDesktopPane1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, -1));

        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECCIONAR>", " " }));
        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jComboBoxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        btnMatricular1.setBackground(new java.awt.Color(153, 255, 255));
        btnMatricular1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMatricular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-accede-redondeado-derecho-64.png"))); // NOI18N
        btnMatricular1.setBorder(null);
        btnMatricular1.setOpaque(true);
        btnMatricular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricular1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnMatricular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 90, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DNI:");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDesktopPane1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-sexo-64.png"))); // NOI18N
        jLabel6.setText("SEXO:");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDesktopPane1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 240, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("EDAD:");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDesktopPane1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 240, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-colegio-48.png"))); // NOI18N
        jLabel8.setText("COLEGIO:");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jComboBoxColegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        jComboBoxColegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxColegioActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jComboBoxColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 150, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        jLabel9.setText("MATRICULACION DE EL ALUMNO");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void txtApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeActionPerformed

    private void jComboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCursoActionPerformed

    
    
    
    /**
 * Método que maneja el evento de clic en el botón "Matricular" en la interfaz de usuario.
 * Realiza la matriculación de un alumno, guarda la información en la base de datos y genera un PDF con los datos de la matrícula.
 * También realiza validaciones de los campos y muestra mensajes de error si es necesario.
 * @param evt El evento de acción que desencadena este método (clic en el botón "Matricular").
 */
    private void btnMatricular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricular1ActionPerformed
       
    Usuario alumno = new Usuario();   // Instancia de la clase Usuario para representar al alumno
    Ctrl_CursoAlumno controlCursoAlumno = new Ctrl_CursoAlumno(); // Instancia del controlador para la relación entre Curso y Alumno
    
        // Obtener el código y nombre del curso seleccionado del ComboBox
    String codigoCurso = jComboBoxCurso.getSelectedItem().toString().trim();
    String nombreCurso = jComboBoxCurso.getSelectedItem().toString().trim();

    // Validar campos
    if (txtNom.getText().equals("") || txtApe.getText().equals("") || txtTel.getText().equals("") || txtDNI.getText().equals("") || txtEdad.getText().equals("") || txtSexo.getText().equals("")) {
           // Mostrar mensaje de error si algún campo obligatorio está vacío
        JOptionPane.showMessageDialog(null, "Complete todos los campos");
          // Resaltar campos obligatorios con color rojo
        txtNom.setBackground(Color.red);
        txtApe.setBackground(Color.red);
        txtTel.setBackground(Color.red);
        txtDNI.setBackground(Color.red);
        txtEdad.setBackground(Color.red);
        txtSexo.setBackground(Color.red);
        
    } else {
            //restaura el color del fondo
            txtNom.setBackground(Color.white);
            txtApe.setBackground(Color.white);
            txtTel.setBackground(Color.white);
            txtDNI.setBackground(Color.white);
            txtEdad.setBackground(Color.white);
            txtSexo.setBackground(Color.white);
        // Consulta para ver si el curso ya existe
        if (!controlCursoAlumno.existeCurso(txtNom.getText().trim())) {
            // Validar la selección del código y nombre del curso
            if (codigoCurso.equalsIgnoreCase("selecciona codigocurso")) {
                JOptionPane.showMessageDialog(null, "Seleccione código del curso");
            } else if (nombreCurso.equalsIgnoreCase("selecciona curso")) {
                JOptionPane.showMessageDialog(null, "Seleccione curso");
            } else {
                try {
                      // Configurar el objeto Usuario con los datos del alumno
                    alumno.setDNI(txtDNI.getText().trim());
                    alumno.setNombreColegio(txtNom.getText().trim());
                    alumno.setNombre(txtNom.getText().trim());
                    alumno.setApellidos(txtApe.getText().trim());
                    alumno.setSexo(txtSexo.getText().trim());
                    alumno.setNumeroTelefonoPadres(txtTel.getText().trim());
                    alumno.setEdad(Integer.parseInt(txtEdad.getText().trim()));  // Asegúrate de que txtEdad es un campo de entrada de texto para la edad

                    // Guardar el alumno
                    if ( controlCursoAlumno.guardar(alumno)) {
                        JOptionPane.showMessageDialog(null, "Alumno matriculado con éxito");
                          // Generar un PDF con los datos de la matrícula
                         Document document = new Document();
                            try { // Obtener la ruta del escritorio del usuario
                                String home = System.getProperty("user.home");
                                String desktopPath = Paths.get(home, "Desktop").toString();
                                String pdfPath = Paths.get(desktopPath, "Matricula_" + txtNom.getText().trim() + ".pdf").toString();
                                PdfWriter.getInstance(document, new FileOutputStream("Matricula_" + txtDNI.getText().trim() + ".pdf"));
                                // Agregar los datos del alumno al PDF
                                document.open();
                                document.add(new Paragraph("Matriculación de Alumno"));
                                document.add(new Paragraph("DNI: " + txtDNI.getText().trim()));
                                document.add(new Paragraph("Nombre: " + txtNom.getText().trim()));
                                document.add(new Paragraph("Apellidos: " + txtApe.getText().trim()));
                                document.add(new Paragraph("Teléfono: " + txtTel.getText().trim()));
                                document.add(new Paragraph("Sexo: " + txtSexo.getText().trim()));
                                document.add(new Paragraph("Edad: " + txtEdad.getText().trim()));
                                document.add(new Paragraph("Curso: " + jComboBoxCurso.getSelectedItem().toString()));
                                document.add(new Paragraph("Colegio: " + jComboBoxColegio.getSelectedItem().toString()));

                                document.close();
                                JOptionPane.showMessageDialog(null, "PDF generado con éxito");
                            
                            } catch (DocumentException | IOException e) {
                                  // Capturar y mostrar cualquier error al generar el PDF
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al matricular alumno");
                        }
                    } catch (Exception e) {
                              // Capturar y mostrar cualquier otro error
                        e.printStackTrace();  // Imprime el error para ayudar en la depuración
                        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El curso ya existe en la base de datos");

        }
        
        }   
    }//GEN-LAST:event_btnMatricular1ActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void jComboBoxColegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxColegioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxColegioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatricular1;
    private javax.swing.JComboBox<String> jComboBoxColegio;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    
    //metodo para cargar los cursos
    /**
 * Método para cargar los datos de los cursos desde la base de datos y mostrarlos en un JComboBox.
 * Si ocurre un error durante la carga de datos, se imprime un mensaje de error en la consola.
 */
    
    private void CargarComboBoxCurso(){
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {  // Establecer la conexión con la base de datos
            cn = conexion.conectar();
            if (cn == null) {
                throw new SQLException("No se pudo establecer la conexión con la base de datos.");
            } // Consulta SQL para obtener los nombres de los cursos desde la tabla 'Curso'
            String sql = "SELECT  NombreCurso FROM Curso";
            st = cn.createStatement();
            rs = st.executeQuery(sql);
     // Limpiar el JComboBox para borrar los elementos predeterminados y evitar duplicados
            jComboBoxCurso.removeAllItems(); // para borrar las que vienen predeterminadas 
            jComboBoxCurso.addItem("selecciona curso");

            while (rs.next()) {
        // Iterar sobre los resultados de la consulta y agregar los nombres de los cursos al JComboBox
                jComboBoxCurso.addItem(rs.getString("NombreCurso"));
            }
        } catch (SQLException e) {
             // Capturar y mostrar cualquier error durante la carga de cursos
            System.out.println("Error al cargar cursos: " + e.getMessage());
        } finally {
            // Cerrar ResultSet, Statement y Connection en el bloque finally
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                  // Capturar y mostrar cualquier error al cerrar los recursos
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    
   /**
 * Método para cargar los datos de las escuelas desde la base de datos y mostrarlos en un JComboBox.
 * Si ocurre un error durante la carga de datos, se imprime un mensaje de error en la consola.
 */
    private void CargarComboBoxColegio(){
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
              // Establecer la conexión con la base de datos
            cn = conexion.conectar();
            if (cn == null) {
                throw new SQLException("No se pudo establecer la conexión con la base de datos.");
            }
                   // Consulta SQL para obtener los nombres de los cursos desde la tabla 'Curso'
            String sql = "SELECT * FROM escuela ";
            st = cn.createStatement();
            rs = st.executeQuery(sql);

                // Limpiar el JComboBox para borrar los elementos predeterminados y evitar duplicados
            jComboBoxColegio.removeAllItems(); // para borrar las que vienen predeterminadas 
            jComboBoxColegio.addItem("selecciona Escuela");

               // Iterar sobre los resultados de la consulta y agregar los nombres de las escuelas al JComboBox
            while (rs.next()) {
                jComboBoxColegio.addItem(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            // Capturar y mostrar cualquier error durante la carga de escuelas
            System.out.println("Error al cargar escuelas: " + e.getMessage());
        } finally {
            // Cerrar ResultSet, Statement y Connection en el bloque finally
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                  // Capturar y mostrar cualquier error al cerrar los recursos
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    }

