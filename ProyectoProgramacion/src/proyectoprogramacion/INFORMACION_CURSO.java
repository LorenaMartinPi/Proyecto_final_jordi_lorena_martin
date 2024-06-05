
package proyectoprogramacion;

/**
 * Clase para mostrar y gestionar la información de las asignaturas.
 */
import com.mysql.jdbc.PreparedStatement;
import conexion.conexion;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class INFORMACION_CURSO extends javax.swing.JInternalFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    private DefaultListModel modelo1=new DefaultListModel();
    private DefaultListModel modelo2=new DefaultListModel();
    
     /**
     * Constructor de la clase.
     */
    public INFORMACION_CURSO() {
        initComponents();// Inicializa los componentes de la interfaz
        //this.CargarComboBoxAsignaturas();
        this.CargarTablaAlumnos();// Carga los datos de las asignaturas en la tabla
         this.setSize(new Dimension(720, 560)); // Establece el tamaño de la ventana interna
        
    }
    
    /**
     * Método para cargar los datos de las asignaturas desde la base de datos y mostrarlos en una tabla.
     */
    private void CargarTablaAlumnos() {
        Connection con = conexion.conectar();// Conexión a la base de datos
        DefaultTableModel model = new DefaultTableModel();// Modelo de la tabla
        String sql = "SELECT  CodigoAsignatura, NombreAsignatura FROM asignatura";
        Statement st;

        try {
            st = con.createStatement(); // Crear un Statement
            ResultSet rs = st.executeQuery(sql);// Ejecutar la consulta


            model.addColumn("CodigoAsignatura");// Agregar columna al modelo
            model.addColumn("NombreAsignatura");
            

            while (rs.next()) {
                Object fila[] = new Object[2];
                for (int i = 0; i < 2; i++) {// Código de asignatura
                    fila[i] = rs.getObject(i + 1);// Nombre de asignatura
                }
                model.addRow(fila);
            }

            rs.close(); // Cierra ResultSet
            st.close(); // Cierra Statement
            con.close(); // Cierra Connection

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla: " + e);// Manejar excepciones
        }

        JT_Asignaturas.setModel(model);// Establecer el modelo de la tabla

       JT_Asignaturas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = JT_Asignaturas.rowAtPoint(e.getPoint()); // Obtener la fila seleccionada
                int columna_point = 0;// Columna de interés

                if (fila_point > -1) {
                    String CodigoAsignatura = (String) model.getValueAt(fila_point, columna_point);// Obtener el código de la asignatura seleccionada
                    EnviarDatosAsignaturaSeleccionada(CodigoAsignatura); // Enviar los datos de la asignatura seleccionada
                }
            }
        });
    }

     /**
     * Método para enviar los datos de la asignatura seleccionada.
     * @param CodigoAsignatura Código de la asignatura seleccionada.
     */
    private void EnviarDatosAsignaturaSeleccionada(String CodigoAsignatura) {
        // Implementa este método para manejar los datos del alumno seleccionado
        System.out.println("Asignatura seleccionada con CodigoAsignatura: " + CodigoAsignatura);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        INFORMACIONCURSO = new javax.swing.JPanel();
        btnAgregar2 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Asignaturas = new javax.swing.JTable();
        btnModificar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        INFORMACIONCURSO.setBackground(new java.awt.Color(255, 204, 255));

        btnAgregar2.setBackground(new java.awt.Color(255, 204, 255));
        btnAgregar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-50.png"))); // NOI18N
        btnAgregar2.setBorder(null);
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        btnEliminar2.setBackground(new java.awt.Color(255, 204, 255));
        btnEliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-borrar-para-siempre-48.png"))); // NOI18N
        btnEliminar2.setBorder(null);
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        JT_Asignaturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_Asignaturas);

        btnModificar2.setBackground(new java.awt.Color(255, 204, 255));
        btnModificar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-modificar-48.png"))); // NOI18N
        btnModificar2.setBorder(null);
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SELECCIONA TUS ASIGNATURAS");

        javax.swing.GroupLayout INFORMACIONCURSOLayout = new javax.swing.GroupLayout(INFORMACIONCURSO);
        INFORMACIONCURSO.setLayout(INFORMACIONCURSOLayout);
        INFORMACIONCURSOLayout.setHorizontalGroup(
            INFORMACIONCURSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFORMACIONCURSOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar2)
                .addGap(148, 148, 148)
                .addComponent(btnEliminar2)
                .addGap(156, 156, 156)
                .addComponent(btnModificar2)
                .addGap(134, 134, 134))
            .addGroup(INFORMACIONCURSOLayout.createSequentialGroup()
                .addGroup(INFORMACIONCURSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(INFORMACIONCURSOLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(INFORMACIONCURSOLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        INFORMACIONCURSOLayout.setVerticalGroup(
            INFORMACIONCURSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFORMACIONCURSOLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(INFORMACIONCURSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INFORMACIONCURSOLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(INFORMACIONCURSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar2)
                            .addComponent(btnModificar2)))
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(142, 142, 142))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(INFORMACIONCURSO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INFORMACIONCURSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
                      
        // Obtener la fila seleccionada en la tabla                                      
    int filaSeleccionada = JT_Asignaturas.getSelectedRow();
    // Verificar si se seleccionó una fila
    if (filaSeleccionada == -1) {
        System.out.println("Debe seleccionar una asignatura para eliminar");
        return;
    }
      // Obtener el código de la asignatura seleccionada
    String codigoAsignatura = JT_Asignaturas.getValueAt(filaSeleccionada, 0).toString(); 
    System.out.println("Código de la asignatura a eliminar: " + codigoAsignatura); // Impresión agregada
        // Conectar a la base de datos
    Connection con = conexion.conectar();
      // Consulta SQL para eliminar la asignatura
    String sql = "DELETE FROM asignatura WHERE CodigoAsignatura = ?";
    
     // Establecer el código de la asignatura en la consulta
    try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
        pst.setString(1, codigoAsignatura); // Cambio aquí
        int filasEliminadas = pst.executeUpdate(); // Se puede utilizar para verificar si alguna fila se ha eliminado
        if (filasEliminadas > 0) {
            System.out.println("Asignatura eliminada correctamente");
            CargarTablaAlumnos(); // Actualizar tabla
        } else {
            System.out.println("No se pudo encontrar la asignatura con el código especificado.");
        }
    } catch (SQLException e) {
        System.out.println("Error al eliminar la asignatura: " + e.getMessage());
    } finally {
        try {
            if (con != null) {
                con.close(); // Cierra la conexión
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }



    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
    // Solicitar al usuario que ingrese el código y nombre de la asignatura
        String codigoAsignatura = JOptionPane.showInputDialog(this, "Ingrese el código de la asignatura:");
        String nombreAsignatura = JOptionPane.showInputDialog(this, "Ingrese el nombre de la asignatura:");
  // Verificar si se ingresaron los datos
        if (codigoAsignatura == null || codigoAsignatura.trim().isEmpty() ||
                nombreAsignatura == null || nombreAsignatura.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el código y el nombre de la asignatura", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
          
    // Conectar a la base de datos
        Connection con = conexion.conectar();
        // Consulta SQL para insertar una nueva asignatura
        String sql = "INSERT INTO asignatura (CodigoAsignatura, NombreAsignatura) VALUES (?, ?)";
        try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
              // Establecer los valores en la consulta
            pst.setString(1, codigoAsignatura.trim());
            pst.setString(2, nombreAsignatura.trim());
             // Ejecutar la consulta de inserción
            pst.executeUpdate();
            
             // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Asignatura agregada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            CargarTablaAlumnos(); // Actualizar tabla
        } catch (SQLException e) {// Manejar errores de SQL
            JOptionPane.showMessageDialog(this, "Error al agregar la asignatura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
   
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
     // Obtener la fila seleccionada en la tabla
        int filaSeleccionada = JT_Asignaturas.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una asignatura para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Obtener los datos actuales de la asignatura seleccionada
    String codigoAsignatura = JT_Asignaturas.getValueAt(filaSeleccionada, 0).toString();
    String nombreAsignatura = JT_Asignaturas.getValueAt(filaSeleccionada, 1).toString();
    
    // Solicitar al usuario que ingrese los nuevos datos
    String nuevoCodigoAsignatura = JOptionPane.showInputDialog(this, "Ingrese el nuevo código de la asignatura:", codigoAsignatura);
    String nuevoNombreAsignatura = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre de la asignatura:", nombreAsignatura);
    
    // Verificar que los campos no estén vacíos
    if (nuevoCodigoAsignatura == null || nuevoCodigoAsignatura.trim().isEmpty() ||
        nuevoNombreAsignatura == null || nuevoNombreAsignatura.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Actualizar los datos de la asignatura en la base de datos
    Connection con = conexion.conectar();
    String sql = "UPDATE asignatura SET CodigoAsignatura=?, NombreAsignatura=? WHERE CodigoAsignatura=?";
    try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
        pst.setString(1, nuevoCodigoAsignatura.trim());
        pst.setString(2, nuevoNombreAsignatura.trim());
        pst.setString(3, codigoAsignatura); // Filtro para identificar la asignatura a modificar
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Asignatura modificada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        CargarTablaAlumnos(); // Actualizar tabla
    } catch (SQLException e) {//maneja errores
        JOptionPane.showMessageDialog(this, "Error al modificar la asignatura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    
    }//GEN-LAST:event_btnModificar2ActionPerformed
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel INFORMACIONCURSO;
    private javax.swing.JTable JT_Asignaturas;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnModificar2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
