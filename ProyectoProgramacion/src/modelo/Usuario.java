/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Usuario {
    // Atributos de la clase Usuario
    private String DNI;
    private int CodigoCurso;
    private String NombreColegio;
    private String  Nombre;
    private String Apellidos;
    private String Sexo;
    private String NumeroTelefonoPadres;
    private int Edad;
    private int idlogin;
    
    // Constructor por defecto de la clase Usuario
    public Usuario(){
        this.DNI = "";
        this.CodigoCurso = 0;
        this.NombreColegio = "";
        this.Nombre = "";
        this.Apellidos = "";
        this.Sexo = "";
        this.NumeroTelefonoPadres = "";
        this.Edad = 0;
        this.idlogin=0;
    
}
    
    // Constructor sobrecargado de la clase Usuario
    public Usuario(String DNI, int CodigoCurso, String NombreColegio, String Nombre, String Apellidos, String Sexo, String NumeroTelefonoPadres, int Edad) {
        this.DNI = DNI;
        this.CodigoCurso = CodigoCurso;
        this.NombreColegio = NombreColegio;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.NumeroTelefonoPadres = NumeroTelefonoPadres;
        this.Edad = Edad;
        this.idlogin = idlogin;
    }

     // Métodos getter y setter para el DNI
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    // Métodos getter y setter para el CodigoCurso
    public int getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(int CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public String getNombreColegio() {
        return NombreColegio;
    }

    public void setNombreColegio(String NombreColegio) {
        this.NombreColegio = NombreColegio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNumeroTelefonoPadres() {
        return NumeroTelefonoPadres;
    }

    public void setNumeroTelefonoPadres(String NumeroTelefonoPadres) {
        this.NumeroTelefonoPadres = NumeroTelefonoPadres;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    // Método toString para obtener una representación de cadena del objeto Usuario
    @Override
    public String toString() {
        return "Usuario{" + "DNI=" + DNI + ", CodigoCurso=" + CodigoCurso + ", NombreColegio=" + NombreColegio + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Sexo=" + Sexo + ", NumeroTelefonoPadres=" + NumeroTelefonoPadres + ", Edad=" + Edad + '}';
    }
    
}
