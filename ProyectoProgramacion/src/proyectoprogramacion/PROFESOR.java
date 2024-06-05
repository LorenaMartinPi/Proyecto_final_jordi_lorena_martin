
package proyectoprogramacion;

import alumno.Alumno;
import java.awt.Desktop;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.net.URI;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import metodos.Metodos;




public class PROFESOR extends javax.swing.JFrame {
    public static JDesktopPane jDesktopPane_menu;// Declaración de un campo estático para el panel de escritorio
    
        
    // Constructor de la clase PROFESOR
    public PROFESOR() {
        initComponents();
          // Establecer el diseño nulo y crear un JDesktopPane
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        // Obtener las dimensiones de la pantalla
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
        // Establecer el tamaño y la posición del JDesktopPane
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        // Agregar el JDesktopPane a la ventana
        this.add(jDesktopPane_menu);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(102, 255, 255));
        jMenuBar1.setOpaque(true);

        jMenu1.setForeground(new java.awt.Color(153, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-buenas-notas-48.png"))); // NOI18N
        jMenu1.setText("NOTAS");

        jMenuItem1.setText("NOTAS_ALUMNOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(102, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-alumnos-48.png"))); // NOI18N
        jMenu2.setText("ALTA_ALUMNOS");

        jMenuItem2.setText("ALTA");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        NOTAS_PROFESOR notas_profesor = new NOTAS_PROFESOR();
        jDesktopPane_menu.add(notas_profesor);
        notas_profesor.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          // Crear una instancia de la ventana NOTAS_PROFESOR
        ALTA_ALUMNOS alta_alumnos = new ALTA_ALUMNOS();
        jDesktopPane_menu.add(alta_alumnos);
        alta_alumnos.setVisible(true);   // Hacer visible la ventana
    }//GEN-LAST:event_jMenuItem2ActionPerformed
     public void INSTAGRAM(){
        try{
          Desktop.getDesktop().browse(URI.create("https://www.instagram.com/iesriberadecastilla/"));
            //DENTRO DE LAS COMILLAS VA EL ENLACE DE LA RED SOCIAL 
        }catch(Exception e){
             // Mostrar un mensaje de error si falla la apertura del enlace
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void TWEETER(){
        try{
          Desktop.getDesktop().browse(URI.create("https://twitter.com/ies_ribera?lang=es"));  
        }catch(Exception e){
             // Mostrar un mensaje de error si falla la apertura del enlace
          JOptionPane.showMessageDialog(null, e);  
        }
    }
    // Método main para ejecutar la aplicación
    public static void main(String args[]) {
          // Crear una instancia de la clase PROFESOR y hacerla visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROFESOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
