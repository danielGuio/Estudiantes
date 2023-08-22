package controlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;
import modelo.EstudianteCrud;
import vista.VistaEstudiante;


public class ControladorEstudiante {
    VistaEstudiante ve;
    EstudianteCrud objEstCrud = new EstudianteCrud();
    Estudiante es;
    ArrayList<Estudiante>lista=new ArrayList<>();

    public ControladorEstudiante() {
    }

    
    public ControladorEstudiante(VistaEstudiante ve) {
        this.ve = ve;
    }
    
    public void insertar(){
        String nombres;
        String apellidos;
        String fechaNacimiento;
        String correoInstitucional;
        String correoPersonal;
        long numeroCel;
        long numeroFijo;
        String programaAcad;
        
        nombres = ve.getTxtNombre().getText();
        apellidos = ve.getTxtApellido().getText();
        fechaNacimiento = ve.getTxtFecha().getText();
        correoInstitucional = ve.getTxtCorrIns().getText();
        correoPersonal = ve.getTxtCorrPer().getText();
        numeroCel = Long.parseLong(ve.getTxtTelCel().getText());
        numeroFijo = Long.parseLong(ve.getTxtTelFijo().getText());
        programaAcad = ve.getTxtPrograma().getText();
        es =new Estudiante(nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCel, numeroFijo, programaAcad);
        objEstCrud.insertar(es);
    }
    
        public void actualizar(){
        String nombres;
        String apellidos;
        String fechaNacimiento;
        String correoInstitucional;
        String correoPersonal;
        long numeroCel;
        long numeroFijo;
        String programaAcad;
        
        nombres = ve.getTxtNombre().getText();
        apellidos = ve.getTxtApellido().getText();
        fechaNacimiento = ve.getTxtFecha().getText();
        correoInstitucional = ve.getTxtCorrIns().getText();
        correoPersonal = ve.getTxtCorrPer().getText();
        numeroCel = Long.parseLong(ve.getTxtTelCel().getText());
        numeroFijo = Long.parseLong(ve.getTxtTelFijo().getText());
        programaAcad = ve.getTxtPrograma().getText();
        es =new Estudiante(nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCel, numeroFijo, programaAcad);
        objEstCrud.modificarEstudiante(es);
    }
        
        public void eliminar(){
            String correoInstitucional;
            correoInstitucional = ve.getTxtCorrIns().getText();
            objEstCrud.eliminarEst(correoInstitucional);            
        }
        
        public void consultar(){
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("Nombres");
            tabla.addColumn("Apellidos");
            tabla.addColumn("Fecha nacimiento");
            tabla.addColumn("Email institucional");
            tabla.addColumn("Email personal");
            tabla.addColumn("Tel Celular");
            tabla.addColumn("Tel Fijo");
            tabla.addColumn("Programa");
            ve.getTablaDatos().setModel(tabla);
            String arreglo[]=new String[8];
            lista = objEstCrud.mostrarEstu();
            
            for(int i = 0; i<lista.size(); i++){
                es = lista.get(i);
                arreglo[0] = es.getNombres();
                arreglo[1] = es.getApellidos();
                arreglo[2] = es.getFechaNacimiento();
                arreglo[3] = es.getCorreoInstitucional();
                arreglo[4] = es.getCorreoPersonal();
                arreglo[5] = String.valueOf(es.getNumeroCel());
                arreglo[6] = String.valueOf(es.getNumeroFijo());
                arreglo[7] = es.getProgramaAcad();
                tabla.addRow(arreglo);
                
            }
        }
        
        public void consultarEstudiante(){
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("Nombres");
            tabla.addColumn("Apellidos");
            tabla.addColumn("Fecha nacimiento");
            tabla.addColumn("Email institucional");
            tabla.addColumn("Email personal");
            tabla.addColumn("Tel Celular");
            tabla.addColumn("Tel Fijo");
            tabla.addColumn("Programa");
            ve.getTablaDatos().setModel(tabla);
            String arreglo[]=new String[8];
            es = objEstCrud.buscar(ve.getTxtCorrIns().getText());
            
                arreglo[0] = es.getNombres();
                arreglo[1] = es.getApellidos();
                arreglo[2] = es.getFechaNacimiento();
                arreglo[3] = es.getCorreoInstitucional();
                arreglo[4] = es.getCorreoPersonal();
                arreglo[5] = String.valueOf(es.getNumeroCel());
                arreglo[6] = String.valueOf(es.getNumeroFijo());
                arreglo[7] = es.getProgramaAcad();
                tabla.addRow(arreglo);
            
        }

}
