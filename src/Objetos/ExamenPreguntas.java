
package Objetos;

import java.io.Serializable;
import java.util.ArrayList;

public class ExamenPreguntas implements Serializable{
    
    private Examen examen;
    private ArrayList<Preguntas> preguntas;

    public ExamenPreguntas(Examen examen, ArrayList<Preguntas> preguntas) {
        this.examen = examen;
        this.preguntas = preguntas;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
    
    public ArrayList<Preguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Preguntas> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "ExamenPreguntas{" + "examen=" + examen + ", preguntas=" + preguntas + '}';
    }
    
    
    
}
