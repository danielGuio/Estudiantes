package vista;

import controlador.CapturaDatos;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Estudiante;

public class VistaMenu {
    Scanner leer = new Scanner(System.in);
    CapturaDatos objCapDatos = new CapturaDatos();
    Estudiante objEstu = new Estudiante();
    ArrayList<Estudiante>datos=new ArrayList<>();
    
    String nombres;
    String apellidos;
    String fechaNacimiento;
    String correoInstitucional;
    String correoPersonal;
    long numeroCel;
    long numeroFijo;
    String programaAcad;
    int opcMenu;
    
    public void vistamenu(){
    
        do{
            String menu = "INSTITUTO LA FLORESTA\n"+
                    "Seleccione tarea a realizar:\n"+
                    "1. Ingresar estudiante\n"+
                    "2. Buscar estudiante\n"+
                    "3. Modificar estudiante\n"+
                    "4. Eliminar Estudiante\n"+
                    "5. Ver directorio de estudiantes\n"+
                    "6. Salir\n"+
                    "Opción:\n";
            System.out.println(menu);
            opcMenu = Integer.parseInt(leer.nextLine());
            switch(opcMenu){
            
                case 1:
                System.out.println("Ingresar estudiante");
                System.out.println("Ingresar nombres:");
                nombres = leer.nextLine();
                System.out.println("Ingresar apellidos:");
                apellidos = leer.nextLine();
                System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
                fechaNacimiento = leer.nextLine();
                System.out.println("Ingresar correo institucional:");
                correoInstitucional=leer.nextLine();
                System.out.println("Ingresar correo personal:");
                correoPersonal = leer.nextLine();
                System.out.println("Ingresar número de celular:");
                    try {
                        numeroCel = Long.parseLong(leer.nextLine());
                    } catch (Exception e) {
                        numeroCel = 0;
                    }
                System.out.println("Ingresar número fijo:");
                try{
                    numeroFijo = Long.parseLong(leer.nextLine());
                }catch (Exception e){
                    numeroFijo = 0;
                }
                System.out.println("Ingresar programa:");
                programaAcad = leer.nextLine();
                objCapDatos.capturadatos(nombres, apellidos, fechaNacimiento, correoInstitucional, correoPersonal, numeroCel, numeroFijo, programaAcad);
                break;

                case 2:
                    System.out.println("Buscar estudiante");
                    System.out.println("Ingresar correo institucional:");
                    correoInstitucional = leer.nextLine();
                    objEstu = objCapDatos.buscarporcorr(correoInstitucional);
                    if (objEstu != null){
                    System.out.println("Información del estudiante\n");
                    System.out.println("Nombres: " + objEstu.getNombres());
                    System.out.println("Apellidos: " + objEstu.getApellidos());
                    System.out.println("Fecha nacimiento: " + objEstu.getFechaNacimiento());
                    System.out.println("Correo institucional: " + objEstu.getCorreoInstitucional());
                    System.out.println("Correo personal: " + objEstu.getCorreoPersonal());
                    System.out.println("Número de teléfono celular: " + objEstu.getCorreoPersonal());
                    System.out.println("Número de teléfono fijo: " + objEstu.getNumeroFijo());
                    System.out.println("Programa académico: " + objEstu.getProgramaAcad()+ "\n");
                    }else{
                        System.out.println("El correo ingresado no se encuentra en la base de datos\n");
                    }
                    break;
                    
                case 3:
                    System.out.println("Modificar estudiante");
                    System.out.println("Ingresar correo institucional:");
                    correoInstitucional = leer.nextLine();
                    objEstu = objCapDatos.buscarporcorr(correoInstitucional);
                    if (objEstu!=null){
                    System.out.println("Ingresar correo personal:");
                    correoPersonal = leer.nextLine();
                    System.out.println("Ingresar número de celular:");
                    try{
                        numeroCel = Long.parseLong(leer.nextLine());
                    }catch (Exception e){
                        numeroCel = 0;
                    }
                    System.out.println("Ingresar número fijo:");
                    try{
                        numeroFijo = Long.parseLong(leer.nextLine());
                    }
                    catch(Exception e){
                        numeroFijo =  0;
                    }
                    System.out.println("Ingresar programa:");
                    programaAcad = leer.nextLine();
                    objCapDatos.modificar(correoInstitucional, correoPersonal, numeroCel, numeroFijo, programaAcad);
                    }else{
                        System.out.println("El correo ingresado no se encuentra en la base de datos\n");
                    }
                    break;
                   
                case 4:
                    System.out.println("Eliminar estudiante");
                    System.out.println("Ingresar correo institucional:");
                    correoInstitucional = leer.nextLine();
                    objEstu = objCapDatos.buscarporcorr(correoInstitucional);
                    if (objEstu!=null){
                    objCapDatos.Eliminar(correoInstitucional);
                    }else{
                        System.out.println("El correo ingresado no se encuentra en la base de datos\n");
                    }
                    break;
                    
                    
                case 5:
                    System.out.println("El directorio de los estudiantes\n");
                    datos = objCapDatos.consultarestudiante();
                    for (Estudiante dato : datos) {
                        System.out.println(dato);
                    }
                    System.out.println("\n");
                    break;
                    
                case 6:
                    System.out.println("Hasta pronto");

                default: opcMenu = 6;
            }
            
        }while(opcMenu != 6);
}
    
}
