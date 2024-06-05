package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.login;

/**
 * La clase Ctrl_Login proporciona un método para verificar las credenciales de inicio de sesión en la base de datos.
 */
public class Ctrl_Login {
     // Método para verificar las credenciales de inicio de sesión en la base de datos.
      public boolean loginUsuario(login objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        String sql = "Select  usuario, contraseña from login where usuario = '" + objeto.getUsuario() + "' and contraseña = '" + objeto.getContraseña() + "';                   ";
        Statement st;
        
        try {

            st = cn.createStatement();// Crea un nuevo Statement para ejecutar la consulta
            ResultSet rs = st.executeQuery(sql);// Ejecuta la consulta SQL y almacena el resultado en un ResultSet

            // Itera sobre el ResultSet para verificar si se encontraron resultados
            while (rs.next()) {
                respuesta = true;// Cambia la respuesta a true si se encuentra un usuario con las credenciales especificadas
            }
        } catch (SQLException e) {
                 // Captura cualquier excepción SQL que pueda ocurrir durante la ejecución de la consulta
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        // Devuelve la respuesta de la operación (true si las credenciales son válidas, false si no son válidas o si hubo algún error)
        return respuesta;
    }
}