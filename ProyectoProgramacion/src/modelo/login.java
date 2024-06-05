
package modelo;

/**
 * La clase login representa las credenciales de inicio de sesión de un usuario en el sistema.
 */

public class login {
    // Atributos de la clase login
    private int idlogin;
    private String usuario;
    private String Contraseña;
    private Rol rol;
    
    // Constructor por defecto de la clase login
    public login(){
        this.idlogin = 0;
        this.usuario = "";
        this.Contraseña = "";
        this.rol = rol.ALUMNO;
    }
    
     // Constructor sobrecargado de la clase login
    public login(int i, String profesor, String profesor123, Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        // Enumeración para representar los roles de usuario
    public enum Rol {
    ALUMNO,
    PROFESOR
    }
     // Constructor sobrecargado de la clase login
    public login(int idlogin, String usuario, String Contraseña) {
        this.idlogin = idlogin;
        this.usuario = usuario;
        this.Contraseña = (Contraseña);
        this.rol = Rol.ALUMNO;
    }
      // Métodos de acceso (getter) y modificación (setter) para los atributos de la clase login
    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = (Contraseña);
    }
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
     // Método toString para obtener una representación de cadena del objeto login
    @Override
    public String toString() {
            return "login{" + "idlogin=" + idlogin + ", usuario=" + usuario + ", Contraseña=" + Contraseña + ", rol=" + rol + '}';
    }

    
}

