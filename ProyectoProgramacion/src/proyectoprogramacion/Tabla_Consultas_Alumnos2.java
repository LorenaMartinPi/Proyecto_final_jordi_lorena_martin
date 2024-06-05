package proyectoprogramacion;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import conexion.conexion;

// Clase para la ventana interna que muestra consultas de alumnos
public class Tabla_Consultas_Alumnos2 extends javax.swing.JInternalFrame {

    // Constructor de la clase
    public Tabla_Consultas_Alumnos2() {
        initComponents();
        this.setSize(new Dimension(740, 430));
        this.setTitle("Tabla_Consultas_Alumno2");
        CargarTablaAlumnos(); // Llama al método para cargar los datos en la tabla
    }
    


    private void CargarTablaAlumnos() {
        Connection con = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT DNI, CodigoCurso, NombreColegio, Nombre, Apellidos, Sexo, NumeroTelefonoPadres, Edad FROM alumnos";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
    // Agregar columnas al modelo de la tabla
            model.addColumn("DNI");
            model.addColumn("CodigoCurso");
            model.addColumn("NombreColegio");
            model.addColumn("Nombre");
            model.addColumn("Apellidos");
            model.addColumn("Sexo");
            model.addColumn("NumeroTelefonoPadres");
            model.addColumn("Edad");
// Agregar filas al modelo de la tabla
            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }

            rs.close(); // Cierra ResultSet
            st.close(); // Cierra Statement
            con.close(); // Cierra Connection

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla: " + e);
        }
// Establecer el modelo de la tabla
        JT_Alumnos.setModel(model);
// Agregar un listener de clic de ratón a la tabla
        JT_Alumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = JT_Alumnos.rowAtPoint(e.getPoint());
                int columna_point = 0;
// Obtener el DNI del alumno seleccionado y llamar al método para manejar los datos
                if (fila_point > -1) {
                    String DNI_ALUMNO = (String) model.getValueAt(fila_point, columna_point);
                    EnviarDatosAlumnoSeleccionado(DNI_ALUMNO);
                }
            }
        });
    }
// Método para manejar los datos del alumno seleccionado
    
    private void EnviarDatosAlumnoSeleccionado(String DNI_Alumno) {
        // Implementa este método para manejar los datos del alumno seleccionado
        System.out.println("Alumno seleccionado con DNI: " + DNI_Alumno);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Alumnos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setClosable(true);
        setOpaque(true);

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 153));

        JT_Alumnos.setBackground(new java.awt.Color(153, 255, 153));
        JT_Alumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_Alumnos);

        btnAgregar.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-50.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 255, 153));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-borrar-para-siempre-48.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setOpaque(true);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(153, 255, 153));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-modificar-48.png"))); // NOI18N
        btnModificar.setBorder(null);
        btnModificar.setOpaque(true);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText(" CONSULTAS DE ALUMNOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(158, 158, 158)
                .addComponent(btnModificar)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar)
                        .addComponent(btnEliminar))
                    .addComponent(btnModificar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
   //Captura de Datos del Usuario:
    String DNI = JOptionPane.showInputDialog(this, "Ingrese el DNI del alumno:");
    String codigoCurso = JOptionPane.showInputDialog(this, "Ingrese el código del curso:");
    String nombreColegio = JOptionPane.showInputDialog(this, "Ingrese el nombre del colegio:");
    String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del alumno:");
    String apellidos = JOptionPane.showInputDialog(this, "Ingrese los apellidos del alumno:");
    String sexo = JOptionPane.showInputDialog(this, "Ingrese el sexo del alumno:");
    String numeroTelefono = JOptionPane.showInputDialog(this, "Ingrese el número de teléfono de los padres:");
    String edad = JOptionPane.showInputDialog(this, "Ingrese la edad del alumno:");

    // Verificar que los campos no estén vacíos
    if (DNI == null || DNI.trim().isEmpty() || codigoCurso == null || codigoCurso.trim().isEmpty() ||
        nombreColegio == null || nombreColegio.trim().isEmpty() || nombre == null || nombre.trim().isEmpty() ||
        apellidos == null || apellidos.trim().isEmpty() || sexo == null || sexo.trim().isEmpty() ||
        numeroTelefono == null || numeroTelefono.trim().isEmpty() || edad == null || edad.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Insertar el nuevo alumno en la base de datos
    Connection con = conexion.conectar();
    String sql = "INSERT INTO alumnos (DNI, CodigoCurso, NombreColegio, Nombre, Apellidos, Sexo, NumeroTelefonoPadres, Edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
          // Establecer los valores de los parámetros en la consulta SQL
        pst.setString(1, DNI.trim());
        pst.setString(2, codigoCurso.trim());
        pst.setString(3, nombreColegio.trim());
        pst.setString(4, nombre.trim());
        pst.setString(5, apellidos.trim());
        pst.setString(6, sexo.trim());
        pst.setString(7, numeroTelefono.trim());
        pst.setString(8, edad.trim());
        
         // Ejecutar la consulta SQL para insertar el nuevo alumno
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Alumno agregado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        CargarTablaAlumnos(); // Actualizar tabla
    } catch (SQLException e) {// Manejar cualquier excepción SQL que pueda ocurrir
        JOptionPane.showMessageDialog(this, "Error al agregar el alumno: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // Obtener la fila seleccionada en la tabla de alumnos
        int filaSeleccionada = JT_Alumnos.getSelectedRow();
        if (filaSeleccionada == -1) {
             // Mostrar un mensaje de advertencia si no se ha seleccionado ninguna fila
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno para eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
           // Obtener el DNI del alumno seleccionado en la tabla
        String DNI_Alumno = JT_Alumnos.getValueAt(filaSeleccionada, 0).toString();
        System.out.println("DNI del alumno a eliminar: " + DNI_Alumno);
          // Establecer conexión con la base de datos
        Connection con = conexion.conectar();
           // Definir la consulta SQL para eliminar el alumno por su DNI
        String sql = "DELETE FROM alumnos WHERE DNI = ?";
        try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
                // Establecer el DNI del alumno como parámetro en la consulta SQL
            pst.setString(1, DNI_Alumno);
            int filasEliminadas = pst.executeUpdate();  // Ejecutar la consulta SQL para eliminar el alumno
            if (filasEliminadas > 0) { // Mostrar un mensaje de éxito si el alumno fue eliminado correctamente
                JOptionPane.showMessageDialog(this, "Alumno eliminado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                CargarTablaAlumnos(); // Actualizar tabla
            } else {  // Mostrar un mensaje de advertencia si no se encontró al alumno con el DNI especificado
                JOptionPane.showMessageDialog(this, "No se pudo encontrar al alumno con el DNI especificado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
               // Mostrar un mensaje de error si ocurre algún error al eliminar al alumno
            JOptionPane.showMessageDialog(this, "Error al eliminar al alumno: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Obtener la fila seleccionada en la tabla de alumnos
        int filaSeleccionada = JT_Alumnos.getSelectedRow();
    if (filaSeleccionada == -1) {  // Verificar si se ha seleccionado una fila
        JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Obtener los datos actuales del alumno seleccionado
    String DNI_Alumno = JT_Alumnos.getValueAt(filaSeleccionada, 0).toString();
    String codigoCurso = JT_Alumnos.getValueAt(filaSeleccionada, 1).toString();
    String nombreColegio = JT_Alumnos.getValueAt(filaSeleccionada, 2).toString();
    String nombre = JT_Alumnos.getValueAt(filaSeleccionada, 3).toString();
    String apellidos = JT_Alumnos.getValueAt(filaSeleccionada, 4).toString();
    String sexo = JT_Alumnos.getValueAt(filaSeleccionada, 5).toString();
    String numeroTelefono = JT_Alumnos.getValueAt(filaSeleccionada, 6).toString();
    String edad = JT_Alumnos.getValueAt(filaSeleccionada, 7).toString();
    
    // Solicitar al usuario que ingrese los nuevos datos
    String nuevoDNI = JOptionPane.showInputDialog(this, "Ingrese el nuevo DNI del alumno:", DNI_Alumno);
    String nuevoCodigoCurso = JOptionPane.showInputDialog(this, "Ingrese el nuevo código del curso:", codigoCurso);
    String nuevoNombreColegio = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre del colegio:", nombreColegio);
    String nuevoNombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre del alumno:", nombre);
    String nuevosApellidos = JOptionPane.showInputDialog(this, "Ingrese los nuevos apellidos del alumno:", apellidos);
    String nuevoSexo = JOptionPane.showInputDialog(this, "Ingrese el nuevo sexo del alumno:", sexo);
    String nuevoNumeroTelefono = JOptionPane.showInputDialog(this, "Ingrese el nuevo número de teléfono de los padres:", numeroTelefono);
    String nuevaEdad = JOptionPane.showInputDialog(this, "Ingrese la nueva edad del alumno:", edad);
    
    // Verificar que los campos no estén vacíos
    if (nuevoDNI == null || nuevoDNI.trim().isEmpty() || nuevoCodigoCurso == null || nuevoCodigoCurso.trim().isEmpty() ||
        nuevoNombreColegio == null || nuevoNombreColegio.trim().isEmpty() || nuevoNombre == null || nuevoNombre.trim().isEmpty() ||
        nuevosApellidos == null || nuevosApellidos.trim().isEmpty() || nuevoSexo == null || nuevoSexo.trim().isEmpty() ||
        nuevoNumeroTelefono == null || nuevoNumeroTelefono.trim().isEmpty() || nuevaEdad == null || nuevaEdad.trim().isEmpty()) {
            // Mostrar un mensaje de advertencia si no se ingresaron todos los campos necesarios
        JOptionPane.showMessageDialog(this, "Debe ingresar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Actualizar los datos del alumno en la base de datos
    Connection con = conexion.conectar();// Establecer conexión con la base de datos
      // Definir la consulta SQL para actualizar los datos del alumno
    String sql = "UPDATE alumnos SET DNI=?, CodigoCurso=?, NombreColegio=?, Nombre=?, Apellidos=?, Sexo=?, NumeroTelefonoPadres=?, Edad=? WHERE DNI=?";
    try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql)) {
        pst.setString(1, nuevoDNI.trim());
        pst.setString(2, nuevoCodigoCurso.trim());
        pst.setString(3, nuevoNombreColegio.trim());
        pst.setString(4, nuevoNombre.trim());
        pst.setString(5, nuevosApellidos.trim());
        pst.setString(6, nuevoSexo.trim());
        pst.setString(7, nuevoNumeroTelefono.trim());
        pst.setString(8, nuevaEdad.trim());
        pst.setString(9, DNI_Alumno); // Filtro para identificar al alumno a modificar
        pst.executeUpdate(); // Ejecutar la consulta SQL para actualizar los datos del alumno
        JOptionPane.showMessageDialog(this, "Alumno modificado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        CargarTablaAlumnos(); // Actualizar tabla
    } catch (SQLException e) {   // Mostrar un mensaje de error si ocurre algún error al modificar al alumno
        JOptionPane.showMessageDialog(this, "Error al modificar el alumno: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JT_Alumnos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}


