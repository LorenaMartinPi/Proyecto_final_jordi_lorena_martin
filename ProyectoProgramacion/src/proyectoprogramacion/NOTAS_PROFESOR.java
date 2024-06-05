
package proyectoprogramacion;

import conexion.conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Clase para la gestión de las notas del profesor, que extiende JInternalFrame
public class NOTAS_PROFESOR extends javax.swing.JInternalFrame {

    
    // Constructor de la clase NOTAS_PROFESOR
    public NOTAS_PROFESOR() {
        initComponents();
           // Establecer el tamaño y el título de la ventana
         this.setSize(new Dimension(833, 437));
        this.setTitle("notas_profesor");
        // Cargar el JComboBox con los DNIs de los alumnos
        this.CargarjComboBoxDNI();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnota1 = new javax.swing.JTextField();
        txtnota2 = new javax.swing.JTextField();
        txtnota3 = new javax.swing.JTextField();
        txtpromedio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAlumno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDNI = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel2.setText("NOTA 1");

        jLabel3.setText("NOTA2");

        jLabel4.setText("NOTA 3");

        jLabel5.setText("PROMEDIO");

        jLabel6.setText("EL ALUMNO ESTA : ");

        txtnota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("NOTAS");

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel7.setText("NOTA FINAL :");

        txtAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlumnoActionPerformed(evt);
            }
        });

        jLabel8.setText("DNI ALUMNO");

        jComboBoxDNI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnota2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(txtnota1)
                                            .addComponent(txtnota3))
                                        .addGap(186, 186, 186)
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(txtnota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     // Método para manejar el evento de clic en el botón de calcular
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
         // Obtener las notas ingresadas por el usuario
        int nota1=Integer.parseInt(txtnota1.getText());
        int nota2=Integer.parseInt(txtnota2.getText());
        int nota3=Integer.parseInt(txtnota3.getText());
        // Calcular el promedio de las notas
        int promedio=((nota1+nota2+nota3)/3);
          // Determinar el estado del alumno (Aprobado o Suspenso)
        if(promedio>=1&&promedio<=4){
            txtAlumno.setText(String.valueOf("Suspenso"));
        }else if(promedio>=5&&promedio<=10){
            txtAlumno.setText(String.valueOf("Aprobado"));
        }else{
            txtAlumno.setText(String.valueOf("Pon notas de 1 al 10"));
        }
          // Mostrar el promedio en el campo correspondiente
        txtpromedio.setText((String.valueOf(promedio)));
    }//GEN-LAST:event_btnCalcularActionPerformed

      // Método para cargar el JComboBox con los DNIs de los alumnos desde la base de datos
    private void CargarjComboBoxDNI(){
        
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            cn = conexion.conectar();  // Establecer la conexión con la base de datos
            if (cn == null) {
                throw new SQLException("No se pudo establecer la conexión con la base de datos.");
            }
            String sql = "SELECT DNI,Nombre FROM alumnos ";   // Consulta SQL para obtener los DNIs y nombres de los alumnos
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            jComboBoxDNI.removeAllItems(); // para borrar las que vienen predeterminadas 
            jComboBoxDNI.addItem("SELECCIONA DNI");

            while (rs.next()) {   // Agregar los DNIs obtenidos a la lista desplegable
                jComboBoxDNI.addItem(rs.getString("DNI"));
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar DNI: " + e.getMessage());
        } finally {
            // Cerrar ResultSet, Statement y Connection en el bloque finally
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    
    private void txtAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> jComboBoxDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtnota1;
    private javax.swing.JTextField txtnota2;
    private javax.swing.JTextField txtnota3;
    private javax.swing.JTextField txtpromedio;
    // End of variables declaration//GEN-END:variables
}
