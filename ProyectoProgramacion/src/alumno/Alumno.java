
package alumno;
/**
 * La clase Alumno representa a un estudiante con atributos como nombre, apellidos, DNI y curso.
 */

public class Alumno {
    String Nombre;
    String Apellido1;
    String Apellido2;
    String DNI;
    String Curso;
// Constructor de la clase Alumno.
    public Alumno(String Nombre, String Apellido1, String Apellido2, String DNI, String Curso) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.DNI = DNI;
        this.Curso = Curso;
    }

    public Alumno() {
        
    }
    
    // Métodos para obtener y establecer los atributos de la clase Alumno con insert code getters and setters y  to string 
    public String getNombre() { //Obtiene el nombre del alumno.
        return Nombre;//@return El nombre del alumno.
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public String getCurso() {
        return Curso;
    }

    public void setNombre(String Nombre) {// Establece el nombre del alumno.
        this.Nombre = Nombre;//Nombre El nombre del alumno.
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    
}


