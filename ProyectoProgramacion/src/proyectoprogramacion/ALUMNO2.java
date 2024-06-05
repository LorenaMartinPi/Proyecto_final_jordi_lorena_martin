package proyectoprogramacion;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * La clase ALUMNO2 representa la ventana principal para la interfaz de usuario de un alumno.
 */
public class ALUMNO2 extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;// Panel de escritorio para mostrar las ventanas internas

    /**
     * Constructor de la clase ALUMNO2.
     * Configura la interfaz de usuario y muestra la ventana principal.
     */
    public ALUMNO2() {
        initComponents();// Inicializa los componentes de la interfaz de usuario
        this.setLocationRelativeTo(null);// Centra la ventana en la pantalla
        this.setLayout(null);// Establece el diseño nulo para colocar componentes manualmente
        
        // Crea y configura el panel de escritorio para las ventanas internas
        jDesktopPane_menu = new JDesktopPane();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width; // Establece el tamaño y la posición del panel de escritorio
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);// Agrega el panel de escritorio a la ventana principal
        setVisible(true);// Hace visible la ventana principal
    }

    @SuppressWarnings("unchecked") // Código generado para la inicialización de componentes
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        DATOS_ALUMNO = new javax.swing.JMenuItem();
        Tabla_Consultas_Alumnos = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        INFORMACION_CURSO = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        CALENDARIO_ESCOLAR = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salida-de-emergencia-50.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setOpaque(true);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-estudiante-masculino-94.png"))); // NOI18N
        jMenu1.setText("DATOS");

        DATOS_ALUMNO.setText("Matriculacion");
        DATOS_ALUMNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATOS_ALUMNOActionPerformed(evt);
            }
        });
        jMenu1.add(DATOS_ALUMNO);

        Tabla_Consultas_Alumnos.setText("Tabla_Consultas_Alumnos");
        Tabla_Consultas_Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tabla_Consultas_AlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(Tabla_Consultas_Alumnos);

        jMenuBar1.add(jMenu1);

        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-curso-48.png"))); // NOI18N
        jMenu7.setText("INFORMACION CURSO");
        jMenu7.setActionCommand("");

        INFORMACION_CURSO.setText("INFORMACION_CURSO");
        INFORMACION_CURSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INFORMACION_CURSOActionPerformed(evt);
            }
        });
        jMenu7.add(INFORMACION_CURSO);

        jMenuBar1.add(jMenu7);

        jMenu8.setForeground(new java.awt.Color(255, 255, 255));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-mes-64.png"))); // NOI18N
        jMenu8.setText("CALENDARIO");

        CALENDARIO_ESCOLAR.setText("CALENDARIO_ESCOLAR");
        CALENDARIO_ESCOLAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALENDARIO_ESCOLARActionPerformed(evt);
            }
        });
        jMenu8.add(CALENDARIO_ESCOLAR);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(791, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void DATOS_ALUMNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATOS_ALUMNOActionPerformed
           // Método generado automáticamente para manejar el evento de clic en el botón "DATOS_ALUMNO"
        DATOS_ALUMNO datos_alumno = new DATOS_ALUMNO();
        jDesktopPane_menu.add(datos_alumno);
        datos_alumno.setVisible(true);

    }//GEN-LAST:event_DATOS_ALUMNOActionPerformed

    private void INFORMACION_CURSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INFORMACION_CURSOActionPerformed
       // Método generado automáticamente para manejar el evento de clic en el botón
        INFORMACION_CURSO informacion_curso = new INFORMACION_CURSO();   // Instancia y muestra la ventana 
        jDesktopPane_menu.add(informacion_curso);
        informacion_curso.setVisible(true);
    }//GEN-LAST:event_INFORMACION_CURSOActionPerformed

    private void CALENDARIO_ESCOLARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALENDARIO_ESCOLARActionPerformed
        // Método generado automáticamente para manejar el evento de clic en el botón
        CALENDARIO calendario = new CALENDARIO();
        jDesktopPane_menu.add(calendario);// Instancia y muestra la ventana 
        calendario.setVisible(true);
    }//GEN-LAST:event_CALENDARIO_ESCOLARActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Método generado automáticamente para manejar el evento de clic en el botón
        Inicio inicio = new Inicio();
        inicio.setVisible(true);// Instancia y muestra la ventana 
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void Tabla_Consultas_AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tabla_Consultas_AlumnosActionPerformed
        // Método generado automáticamente para manejar el evento de clic en el botón
        Tabla_Consultas_Alumnos2 tabla_consultas_alumnos2 = new Tabla_Consultas_Alumnos2();
        jDesktopPane_menu.add(tabla_consultas_alumnos2);// Instancia y muestra la ventana 
        tabla_consultas_alumnos2.setVisible(true);

    }//GEN-LAST:event_Tabla_Consultas_AlumnosActionPerformed

/**
 * Método principal que inicia la aplicación ALUMNO2.
 * Este método crea una instancia de la clase ALUMNO2 y la hace visible en la interfaz de usuario.
 * @param args Los argumentos de la línea de comandos (no se utilizan en esta aplicación).
 */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 // Crea una nueva instancia de la clase ALUMNO2 y la hace visible
                new ALUMNO2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CALENDARIO_ESCOLAR;
    private javax.swing.JMenuItem DATOS_ALUMNO;
    private javax.swing.JMenuItem INFORMACION_CURSO;
    private javax.swing.JMenuItem Tabla_Consultas_Alumnos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
