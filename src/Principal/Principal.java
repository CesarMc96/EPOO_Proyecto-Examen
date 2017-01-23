
package Principal;


import Objetos.Archivos;
import Objetos.Examen;
import Objetos.ExamenPreguntas;
import Objetos.Fecha;
import Objetos.Persona;
import Objetos.Preguntas;
import Pantallas.AcercaDialog;
import Pantallas.ExamenDialog;
import Pantallas.IntentosDialog;
import Pantallas.LoginDialog;
import Pantallas.PreguntasDialog;
import Pantallas.PrincipalFrameAdmin;
import Pantallas.PrincipalFrameAlumnos;
import Pantallas.PrincipalFrameDocentes;
import Pantallas.UserDialog;
import Pantallas.UsuariosDialog;
import Pantallas.VerDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;


public class Principal {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

//        Archivos c = new Archivos();
//        c.crearUsuariosIniciales();
        
        //LoginDialog ld = new LoginDialog();
        
        //AcercaDialog ac = new AcercaDialog();
        //VerDialog vd = new VerDialog();
        //UserDialog usd = new UserDialog();
        //IntentosDialog id = new IntentosDialog();
        //PreguntasDialog pd = new PreguntasDialog();
        //PrincipalFrameAlumnos ld = new PrincipalFrameAlumnos();
        PrincipalFrameAdmin id = new PrincipalFrameAdmin();
        
//        Examen e1 = new Examen("Programacion Visual", "Parcial 1", "Ventanas y Contenedores", "10", "5", "3", new Fecha(21, 01, 2017));
//        
//        ArrayList<Preguntas> preguntas = new ArrayList<>();
//        
//        preguntas.add(new Preguntas("¿De que color es el cielo?", "Azul", "Rojo", "Blanco", "Gris"));
//        preguntas.add(new Preguntas("¿De que color es el cielo?", "Azul", "Rojo", "Blanco", "Gris"));
//        preguntas.add(new Preguntas("¿De que color es el cielo?", "Azul", "Rojo", "Blanco", "Gris"));
//        preguntas.add(new Preguntas("¿De que color es el cielo?", "Azul", "Rojo", "Blanco", "Gris"));
//        preguntas.add(new Preguntas("¿De que color es el cielo?", "Azul", "Rojo", "Blanco", "Gris"));
//        preguntas.add(new Preguntas("¿De que color es el cielo?", "Azul", "Rojo", "Blanco", "Gris"));
//        
//        ExamenPreguntas ep = new ExamenPreguntas(e1, preguntas);
//        
//        System.out.println(ep);
//        
//        ArrayList<ExamenPreguntas> epp = new ArrayList<>();
//        
//        Archivos.escribirExamenPreguntas(epp);
//        
//        ArrayList<Examen> exa = new ArrayList<>();
//        exa.add(e1);
//        
//        Archivos.escribirExamen(exa);
//        
        //PrincipalFrameDocentes l = new PrincipalFrameDocentes();
    }
}
