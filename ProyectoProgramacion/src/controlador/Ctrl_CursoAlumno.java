
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;
import conexion.conexion;
import java.sql.PreparedStatement;

/**
 * La clase Ctrl_CursoAlumno proporciona métodos para gestionar la información de los alumnos en relación con los cursos.
 */
public class Ctrl_CursoAlumno {
    // Método para guardar un nuevo alumno en la base de datos.
    //objeto El objeto de tipo Usuario que representa al alumno a guardar.
    // * @return true si el alumno se guarda exitosamente, false si hay algún error
    
    public boolean guardar(Usuario objeto){
      
    boolean respuesta = false;// Variable para almacenar la respuesta de la operación (éxito o fracaso)
    Connection cn = conexion.conectar();// Obtiene una conexión a la base de datos utilizando el método estático conectar() de la clase conexion
    try {
        // Prepara una consulta SQL parametrizada para insertar un nuevo alumno en la tabla Alumnos
        PreparedStatement consulta = cn.prepareStatement("INSERT INTO Alumnos (DNI, CodigoCurso, NombreColegio, Nombre, Apellidos, Sexo, NumeroTelefonoPadres, Edad) VALUES(?,?,?,?,?,?,?,?)");
        // Establece los valores de los parámetros en la consulta SQL utilizando los métodos de acceso del objeto Usuario
        consulta.setString(1, objeto.getDNI());
        consulta.setInt(2, objeto.getCodigoCurso());
        consulta.setString(3, objeto.getNombreColegio());
        consulta.setString(4, objeto.getNombre());
        consulta.setString(5, objeto.getApellidos());
        consulta.setString(6, objeto.getSexo());
        consulta.setString(7, objeto.getNumeroTelefonoPadres());
        consulta.setInt(8, objeto.getEdad());

        // Ejecuta la consulta y verifica si se insertó algún registro en la tabla
        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        
        // Cierra la conexión a la base de datos
        cn.close();
        
    } catch (SQLException e) {
          // Captura cualquier excepción SQL que pueda ocurrir durante la ejecución de la consulta
        System.out.println("Error al guardar alumno: " + e);
    }
    // Devuelve la respuesta de la operación (true si se guardó exitosamente, false si hubo algún error)
    return respuesta;
}

    
    /**
 *  proporciona métodos para realizar consultas relacionadas con la existencia de cursos en la base de datos.
 */
    //metodo para consultar si el curso ya existe 
    public boolean existeCurso(String CursoAlumno){
        boolean respuesta = false;// Variable para almacenar la respuesta de la consulta (existe o no)
        String sql ="select NombreCurso from Curso where NombreCurso = '"+CursoAlumno+"';";// Consulta SQL para buscar el curso por su nombre
        Statement st;// Objeto Statement para ejecutar la consulta
        
        try{
            Connection cn = conexion.conectar();// Obtiene una conexión a la base de datos utilizando el método estático conectar() de la clase conexio
            st = cn.createStatement();// Creo un nuevo Statement para ejecutar la consulta
            ResultSet rs = st.executeQuery(sql); // Ejecuta la consulta SQL y almacena el resultado en un ResultSet
            
            //el ResultSet para verificar si se encontraron resultados
            while (rs.next()){
                respuesta= true;// Cambia la respuesta a true si se encuentra al menos un curso con el nombre especificado
            }//cierra el ResultSet, el Statement y la conexión a la base de datos
             rs.close();
            st.close();
            cn.close();
        }catch (SQLException e ){
             // Captura cualquier excepción SQL que pueda ocurrir durante la ejecución de la consulta
            System.out.println("error al consultar el curso "+e);
        }
          // Devuelve la respuesta de la consulta (true si el curso existe, false si no existe o si hubo algún error)
        return respuesta;
    }
}
