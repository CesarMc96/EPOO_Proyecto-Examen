package Objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivos {
    
    public static void escribirUsuarios (ArrayList<Persona> arreglo) throws FileNotFoundException, IOException{
        
        File file = new File("UsuariosIniciales.dat");
        FileOutputStream output = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(output);
        
        writer.writeObject(arreglo);
        
        writer.close();
        output.close();
    }
    
    public static ArrayList<Persona> cargarUsuariosIniciales() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File file = new File("UsuariosIniciales.dat");
        FileInputStream input = new FileInputStream(file);
        ObjectInputStream reader = new ObjectInputStream(input);
        
        ArrayList<Persona> retorno = (ArrayList<Persona>)reader.readObject();
     
        return retorno;
    }

    public static void crearUsuariosIniciales() throws FileNotFoundException, IOException {
        
        ArrayList<Persona> UIniciales = new ArrayList<>();
        UIniciales.add(new Persona("César Alejandro Montaño Cortés ", "CesarMC96 ", "cesar123 ", "Alumno", "Permitido"));
        UIniciales.add(new Persona("Luis Lopez Ojeda ", "LuisOD ", "luiss ", "Alumno", "Permitido"));
        UIniciales.add(new Persona("Omar Antonio Cruz Rendon ", "Omcra ", "o2ads ", "Alumno", "Bloqueado"));
        UIniciales.add(new Persona("Juan Antonio Gabriel Bolaños ", "JuanSkull ", "gatitopeludo ", "Alumno", "Permitido"));
        UIniciales.add(new Persona("Daniel Karim Ricardez ", "KarimNot ", "maestro ", "Docente ", "Permitido"));
        UIniciales.add(new Persona("Josue Hernandes Barrita ", "Barrita ", "coordinador ", "Docente", "Permitido"));
        
        File file = new File("UsuariosIniciales.dat");
        FileOutputStream output = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(output);
               
        writer.writeObject(UIniciales);
        
        writer.close();
        output.close();
    }
        
    public static ArrayList<Examen> cargarExamenes() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File file = new File("Examenes.dat");
        FileInputStream input = new FileInputStream(file);
        ObjectInputStream reader = new ObjectInputStream(input);
        
        ArrayList<Examen> retorno = (ArrayList<Examen>)reader.readObject();
     
        return retorno;
    }
        
    public static void escribirExamen (ArrayList<Examen> arreglo) throws FileNotFoundException, IOException{
        
        File file = new File("Examenes.dat");
        FileOutputStream output = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(output);
        
        writer.writeObject(arreglo);
        
        writer.close();
        output.close();
    }
    
    public static ArrayList<ExamenPreguntas> cargarExamenesPreguntas() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File file = new File("Examenes.dat");
        FileInputStream input = new FileInputStream(file);
        ObjectInputStream reader = new ObjectInputStream(input);
        
        ArrayList<ExamenPreguntas> retorno = (ArrayList<ExamenPreguntas>)reader.readObject();
     
        return retorno;
    }
        
    public static void escribirExamenPreguntas (ArrayList<ExamenPreguntas> arreglo) throws FileNotFoundException, IOException{
        
        File file = new File("Examenes.dat");
        FileOutputStream output = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(output);
        
        writer.writeObject(arreglo);
        
        writer.close();
        output.close();
    }
}
