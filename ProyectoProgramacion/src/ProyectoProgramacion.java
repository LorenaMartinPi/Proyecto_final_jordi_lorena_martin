
import javax.swing.*;
import java.awt.event.*;

//clase principal que representa la aplicacion de inicio de sesion 
public class ProyectoProgramacion extends JFrame implements ActionListener {
    // Componentes de la interfaz de usuario
    private JLabel userLabel, passwordLabel, messageLabel;// Etiquetas para nombre de usuario, contraseña y mensajes
    private JTextField userTextField;// Campo de texto para ingresar el nombre de usuario
    private JPasswordField passwordField;// Campo de contraseña para ingresar la contraseña
    private JButton loginButton; // Botón para iniciar sesión

    // Constructor de la clase
    public ProyectoProgramacion() {
    }

    
    // Método principal de la aplicación
    public static void main(String[] args) {
        new ProyectoProgramacion();// Crea una instancia de la clase ProyectoProgramacion
    }
    // Clase interna para la conexión a la base de datos
    public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/PROYECTO_PROGRAMACION";
    private static final String USER = "lorena";// Nombre de usuario de la base de datos
    private static final String PASSWORD = "1234";// Contraseña de la base de datos

    
}
    @Override
    public void actionPerformed(ActionEvent e) {// Genera una excepción de operación no admitida
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
