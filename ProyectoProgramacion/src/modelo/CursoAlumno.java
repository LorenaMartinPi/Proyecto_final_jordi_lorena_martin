
package modelo;
/**
 * La clase CursoAlumno representa un curso al que pertenecen los alumnos.
 */

public class CursoAlumno {
  //Atributos
    private int CodigoCurso;
    private String NombreCurso;
    
    //constructor
     public CursoAlumno(){
         this.CodigoCurso=0;
         this.NombreCurso="";
     }
     //constructor sobrecargado insert into 
    public CursoAlumno(int CodigoCurso, String NombreCurso) {
        this.CodigoCurso = CodigoCurso;
        this.NombreCurso = NombreCurso;
    }
     //setter and getters 

    public int getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(int CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    @Override
    public String toString() {
        return "CursoAlumno{" + "CodigoCurso=" + CodigoCurso + ", NombreCurso=" + NombreCurso + '}';
    }
    
}
