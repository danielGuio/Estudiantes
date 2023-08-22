package controlador;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    Connection cnn;//variable de la clase conexion, esta se llama importandio el paquete java.sql
    
    public Connection conexiondb(){//metodod e conexion en donde se crea la conexion a base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//se guia a donde estan los drivers para la conexion con la base de datos
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de driver: " + ex);
        }
        try {
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/bd_estudiantes", "root","");//se guarda en la variable cnn de tipo connecion
            //el drivermanager.traerconexion.despues se le dan los parametros para la conexion, url, usuario y contraseña de la base de datos
            //JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (SQLException ex) {
            System.out.println("Problemas con la conexion url, usuario o contraseña de la bd: " + ex);     
        }
        return cnn;
    }

}
