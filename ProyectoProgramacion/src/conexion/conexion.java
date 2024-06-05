
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * La clase conexion proporciona un método estático para establecer una conexión a una base de datos MySQL.
 */

public class conexion {
    
    
    private static final String URL = "jdbc:mysql://localhost:3306/base_datos_programacion"; // URL de la base de datos
    private static final String USER = "lorena"; // Nombre de usuario de la base de datos
    private static final String PASSWORD = "1234"; // Contraseña de la base de datos

    /**
     * Establece una conexión a la base de datos.
     * Una instancia de Connection que representa la conexión a la base de datos.
     */
    public static Connection conectar() {
          // Inicializa la conexión como nula
        Connection con = null;
        try {  
// Intenta establecer la conexión utilizando DriverManager
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
// Maneja cualquier excepción SQL que pueda ocurrir al intentar establecer la conexión

            System.out.println("Error al conectar: " + e.getMessage());
        }
           // Devuelve la conexión (puede ser nula si hubo un error al conectar)
        return con;
    }
}  




