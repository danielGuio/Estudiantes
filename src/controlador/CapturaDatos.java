package controlador;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.EstudianteCrud;

public class CapturaDatos {
    EstudianteCrud objEstCrud = new EstudianteCrud();
    Estudiante objEstudiante;
        
    public void capturadatos(String nombres, String apellidos, String fechaNacimiento, String correoInstitucional, String correoPersonal, long numeroCel, long numeroFijo, String programaAcad){
        objEstudiante = new Estudiante(nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCel, numeroFijo, programaAcad);
        objEstCrud.insertar(objEstudiante);
        
    }
    
    
    public Estudiante buscarporcorr(String correoInst){
        return objEstCrud.buscar(correoInst);
    }
    
    public void modificar(String correoInstitucional, String correoPersonal, long numeroCel, long numeroFijo, String programaAcad){
       objEstudiante = new Estudiante(correoInstitucional, correoPersonal, numeroCel, numeroFijo, programaAcad);
       objEstCrud.modificarEstudiante(objEstudiante);
    }
    
    public void Eliminar(String correoIns){
        objEstCrud.eliminarEst(correoIns);
}
    
    public ArrayList<Estudiante>consultarestudiante(){
        return objEstCrud.mostrarEstu();
    } 
}
