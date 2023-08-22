package modelo;

import controlador.Conexion;
import java.util.ArrayList;
import java.sql.*;

public class EstudianteCrud {
    Estudiante objEstudiante;
    PreparedStatement ps;
    Conexion con = new Conexion();
    Connection cnn = con.conexiondb();
    ResultSet rs;//hace parte de java sql, es como un array que peermite capturar los datos de la consulta a la base de datos
    ArrayList<Estudiante>lista=new ArrayList<>();
    int x;
    
    public void insertar(Estudiante objEstudiante){
        try {
            ps = cnn.prepareStatement("INSERT INTO estudiantes (nombre, apellido,"
                    + "fecha_nacimiento,correoInstitucional, correoPersonal, numeroCel, "
                    + "numeroFijo, programaAcad)values (?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, objEstudiante.getNombres());
            ps.setString(2, objEstudiante.getApellidos());
            ps.setString(3, objEstudiante.getFechaNacimiento());
            ps.setString(4, objEstudiante.getCorreoInstitucional());
            ps.setString(5, objEstudiante.getCorreoPersonal());
            ps.setString(6, Long.toString(objEstudiante.getNumeroCel()));
            ps.setString(7, Long.toString(objEstudiante.getNumeroFijo()));
            ps.setString(8, objEstudiante.getProgramaAcad());
            ps.executeUpdate();
            System.out.println("Se agregó el estudiante\n");
        } catch (SQLException ex) {
            System.out.println("Error al insertar un estudiante en la base de datos: " + ex);
        }
    }
    
    public Estudiante buscar(String correoIns){
        try {
            ps = cnn.prepareStatement("select * from estudiantes where correoInstitucional = '"+correoIns+"'");
            rs = ps.executeQuery();
             while(rs.next()){
                objEstudiante = new Estudiante(rs.getString(2), rs.getString(3), rs.getString(4), 
                rs.getString(5), rs.getString(6), rs.getLong(7), rs.getLong(8), rs.getString(9));
             }
        } catch (SQLException ex) {
            System.out.println("Error al traer los datos de los estudiantes de la base de datos " + ex);
        }
        return objEstudiante;    
    }
    
        public Estudiante buscarPorApell(String apellidos){
        try {
            System.out.println("Información del estudiante");
            ps = cnn.prepareStatement("select * from estudiantes where apellido = '"+apellidos+"'");
            rs = ps.executeQuery();
             while(rs.next()){
                objEstudiante = new Estudiante(rs.getString(2), rs.getString(3), rs.getString(4), 
                rs.getString(5), rs.getString(6), rs.getLong(7), rs.getLong(8), rs.getString(9));
             }
        } catch (SQLException ex) {
            System.out.println("Error al traer los datos de los estudiantes de la base de datos buscando por apellido " + ex);
        }
        return objEstudiante;    
    }
        
            
        public Estudiante buscarPorprogr(String programa){
        try {
            System.out.println("Información del estudiante");
            ps = cnn.prepareStatement("select * from estudiantes where programaAcad = '"+programa+"'");
            rs = ps.executeQuery();
             while(rs.next()){
                objEstudiante = new Estudiante(rs.getString(2), rs.getString(3), rs.getString(4), 
                rs.getString(5), rs.getString(6), rs.getLong(7), rs.getLong(8), rs.getString(9));
             }
        } catch (SQLException ex) {
            System.out.println("Error al traer los datos de los estudiantes de la base de datos buscando por programa " + ex);
        }
        return objEstudiante;    
    }
    
    public void modificarEstudiante(Estudiante est){
        try {
            ps = cnn.prepareStatement("UPDATE estudiantes SET correoPersonal='"+est.getCorreoPersonal()+"', numeroCel='"
                    +est.getNumeroCel()+"', numeroFijo='"+est.getNumeroFijo()+"', programaAcad='"+est.getProgramaAcad()+"' where correoInstitucional = '"+est.getCorreoInstitucional()+"'");
            ps.executeUpdate();
            System.out.println("Se modificó el estudiante\n");
        } catch (SQLException ex) {
            System.out.println("Error almodificar los datos del estudiante enla base de datos: " + ex);
        }
        

    }
    
    public void eliminarEst(String correoIns){
        try {
            ps = cnn.prepareStatement("delete from estudiantes where correoInstitucional = ?");
            ps.setString(1, correoIns);
            ps.executeUpdate();
            System.out.println("Se eliminó el estudiante\n");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un estudiante" + ex);
        }
       
    }
    
    public ArrayList<Estudiante> mostrarEstu(){
        ArrayList<Estudiante>lista = new ArrayList();
        try {
            ps = cnn.prepareStatement("select * from estudiantes");
            rs = ps.executeQuery();
            while(rs.next()){
                objEstudiante = new Estudiante(rs.getString(2), rs.getString(3), rs.getString(4), 
                rs.getString(5), rs.getString(6), rs.getLong(7), rs.getLong(8), rs.getString(9));
                lista.add(objEstudiante);
            }
        } catch (SQLException ex) {
            System.out.println("Error al traer los datos de los estudiantes de la base de datos " + ex);
        }
        return lista;
    }
    
}
