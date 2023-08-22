package modelo;
import java.io.*;
import java.util.ArrayList;

public class Archivo {
    File archivo = new File("datos_estudiantes.dat");
    ObjectOutputStream salida;
    ObjectInputStream entrada;
    
    public void guardararchivo(ArrayList<Estudiante>lista, File archivo){
        try{
            if(!archivo.exists()){
                archivo.createNewFile();
            }           
            salida = new ObjectOutputStream(new FileOutputStream(archivo));
            salida.writeObject(lista);
            salida.close();
        }catch (IOException exc){
            System.out.println("error al guardar en el archivo metodo objectOutput " + exc);
        }
    }
    
    public ArrayList<Estudiante> leerarchivo(File archivo){
        ArrayList <Estudiante> leer = new ArrayList<>();
        try {
            entrada = new ObjectInputStream(new FileInputStream(archivo));
            leer = (ArrayList<Estudiante>)entrada.readObject();
        } catch (Exception exp) {
            System.out.println("Error al leer el archvo metodo ObjectInput " + exp);
        }
            return leer;
    }
    
    public File getArchivo(){
        return archivo;
    }
}
