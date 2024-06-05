/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import alumno.Alumno;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */
public class Metodos {
     // Vector para almacenar instancias de la clase Alumno
    Vector vPrincipal =new Vector();
    
    // * Método para guardar un alumno en el vector.
    public void guardar(Alumno unAlumno){ // Agrega el alumno al vector vPrincipal
        vPrincipal.addElement(unAlumno);
    }
    
    //Método para guardar un alumno en un archivo de texto.
    public void guardarArchivo(Alumno alumno){
        try{
              // Abre un FileWriter en modo de agregar al archivo "Alumnos.txt"
          FileWriter fw=new FileWriter("Alumnos.txt",true);  
          BufferedWriter bw =new BufferedWriter(fw);// Crea un BufferedWriter para escribir en el archivo
          PrintWriter pw= new PrintWriter(bw);// Crea un PrintWriter para escribir texto formateado en el archivo
            // Escribo los datos del alumno en el archivo separados por "|"
          pw.print(alumno.getNombre());
          pw.print("|"+alumno.getApellido1());
          pw.print("|"+alumno.getApellido2());
          pw.print("|"+alumno.getDNI());
          pw.println("|"+alumno.getCurso());
          
          pw.close(); // Cierra el PrintWriter
          
        }catch(Exception e){
            // Muestra un mensaje de error si ocurre alguna excepción
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * Método para obtener una tabla de alumnos desde un archivo de texto.
     * @return Un objeto DefaultTableModel que representa los datos de los alumnos en una tabla.
     */
    public DefaultTableModel listaAlumno(){
        Vector columnas =new Vector();// Vector para almacenar los nombres de las columnas
        columnas.addElement("Nombre");
        columnas.addElement("Apellido1");
        columnas.addElement("Apellido2");
        columnas.addElement("DNI");
        columnas.addElement("Curso");
        
        DefaultTableModel mdlTabla =new DefaultTableModel(columnas,0);// Creo un modelo de tabla sin filas
        
        try{
             // Abro un FileReader para leer el archivo "Alumnos.txt"
            FileReader fr = new FileReader("Alumnos.txt");
            BufferedReader br = new BufferedReader(fr); // Crea un BufferedReader para leer caracteres del archivo
            String d; // Variable para almacenar cada línea del archivo
            
            while((d=br.readLine())!=null){     // Lee cada línea del archivo y la agrega como una fila en el modelo de tabla
                
                StringTokenizer dato = new StringTokenizer(d,"|");// Divide la línea en tokens utilizando "|"
                Vector x = new Vector();// Vector para almacenar los datos de una fila
                
                while(dato.hasMoreTokens()){// Agrega los tokens como elementos del vector x
                    x.addElement(dato.nextToken());
            }
            mdlTabla.addRow(x);// Agrega el vector x como una fila en el modelo de tabla
            
            }
             br.close(); // Cierra el BufferedReader
             
        }catch(Exception e){// Muestra un mensaje de error si ocurre alguna excepción
          JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla; // Devuelve el modelo de tabla con los datos de los alumnos
    }
}
