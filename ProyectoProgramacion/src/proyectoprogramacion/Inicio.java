
package proyectoprogramacion;
import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.net.URI;
import conexion.conexion;
import controlador.Ctrl_Login;
import modelo.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import modelo.login.Rol;
import modelo.login;

// Clase principal Inicio
public class Inicio extends javax.swing.JFrame {
private JRadioButton OPCIONPROFESOR;
private JRadioButton OPCIONALUMNO;
private ButtonGroup group;

  // Constructor de la clase Inicio
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        //para que aparezca la ventana en el centro
    }
    public class LoginHandler {
        // Método para iniciar sesión
    public void iniciarSesion(String usuario, String contraseña) {
        // Aquí se debe implementar la lógica para obtener el usuario desde la base de datos
        login usuarioLogin = obtenerUsuarioDesdeBD(usuario, contraseña);

        if (usuarioLogin != null) {
            if (usuarioLogin.getContraseña().equals(contraseña)) {
                switch (usuarioLogin.getRol()) {
                    case ALUMNO:
                        // Redirigir a la interfaz de alumno
                        mostrarInterfazAlumno();
                        break;
                    case PROFESOR:
                        // Redirigir a la interfaz de profesor
                        mostrarInterfazProfesor();
                        break;
                }
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

         // Método para obtener un usuario desde la base de datos
    private login obtenerUsuarioDesdeBD(String usuario, String contraseña) {
           //  obtener el usuario desde la base de datos
        if (usuario.equals("profesor") && contraseña.equals("profesor123")) {
            return new login(1, "profesor", "profesor123", Rol.PROFESOR);
        } else if (usuario.equals("alumno") && contraseña.equals("alumno123")) {
            return new login(2, "alumno", "alumno123", Rol.ALUMNO);
        }
        return null;
    }
    // Método para mostrar la interfaz de alumno
    private void mostrarInterfazAlumno() {
        System.out.println("Redirigiendo a la interfaz de alumno...");
      
    }
// Método para mostrar la interfaz de profesor
    private void mostrarInterfazProfesor() {
        System.out.println("Redirigiendo a la interfaz de profesor...");
        
    }
}
    //metodos para abrir cada red social 
    public void INSTAGRAM(){
        try{
          Desktop.getDesktop().browse(URI.create("https://www.instagram.com/iesriberadecastilla/"));
            //DENTRO DE LAS COMILLAS VA EL ENLACE DE LA RED SOCIAL 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void TWEETER(){
        try{
          Desktop.getDesktop().browse(URI.create("https://twitter.com/ies_ribera?lang=es"));  
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JTextField();
        CONTRASEÑA = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        OPCIONPROFESOR1 = new javax.swing.JRadioButton();
        OPCIONALUMNO1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Usuario:");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Contraseña:");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));
        jDesktopPane1.add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 420, 30));
        jDesktopPane1.add(CONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 430, 30));

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setText("INICIAR SESION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 150, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuario-96.png"))); // NOI18N
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 110, 110));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salida-de-emergencia-50.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, -1, -1));

        OPCIONPROFESOR1.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(OPCIONPROFESOR1);
        OPCIONPROFESOR1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OPCIONPROFESOR1.setText("PROFESOR");
        OPCIONPROFESOR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONPROFESOR1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(OPCIONPROFESOR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        OPCIONALUMNO1.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(OPCIONALUMNO1);
        OPCIONALUMNO1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OPCIONALUMNO1.setText("ALUMNO");
        jDesktopPane1.add(OPCIONALUMNO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("¡Bienvenido!");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-instagram-100.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 69));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-twitterx-50.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 60, 69));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("LOGIN INICIO");

        pack();
    }// </editor-fold>//GEN-END:initComponents

       // Método generado automáticamente por NetBeans para inicializar los componentes de la interfaz
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        TWEETER();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        INSTAGRAM();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void OPCIONPROFESOR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCIONPROFESOR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OPCIONPROFESOR1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Cerrar la ventana
    }//GEN-LAST:event_jButton5ActionPerformed

    // Método para manejar el evento de clic en el botón de iniciar sesión
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.login(); // Realizar el inicio de sesión

    }//GEN-LAST:event_jButton6ActionPerformed
    

     
   
   public static void main(String args[]) {
    // Método principal para ejecutar la aplicación
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);// Crear y mostrar la ventana de inicio
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONTRASEÑA;
    private javax.swing.JRadioButton OPCIONALUMNO1;
    private javax.swing.JRadioButton OPCIONPROFESOR1;
    private javax.swing.JTextField USUARIO;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    // Método para realizar el inicio de sesión
      private void login() {
        if (!USUARIO.getText().isEmpty() && !CONTRASEÑA.getText().isEmpty()) {
            Ctrl_Login controlUsuario = new Ctrl_Login();
            login usuario = new login();
            usuario.setUsuario(USUARIO.getText().trim());
            usuario.setContraseña(CONTRASEÑA.getText().trim());
            
             

            if (controlUsuario.loginUsuario(usuario)) {
                
                JOptionPane.showMessageDialog(null, "Login Correcto..");
                if (OPCIONALUMNO1.isSelected()) {
                    ALUMNO2 menu = new ALUMNO2();
                    menu.setVisible(true);
                   
                } else if (OPCIONPROFESOR1.isSelected()) {
                    PROFESOR menu = new PROFESOR();
                    menu.setVisible(true);
                   
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una opción");
                    return;
                }
                this.dispose(); // Cerrar la ventana de inicio de sesión
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa los datos de accceso");
        }
    }
}

