
package Objetos;

import java.io.Serializable;
import java.util.ArrayList;

public class Examen implements Serializable{
    
    private String Materia;
    private String Parcial;
    private String Tema;
    private String numPReguntas;
    private String pregRealizar;
    private String numIntentos;
    private Fecha fecha;

    public Examen(String Materia, String Parcial, String Tema, String numPReguntas, String pregRealizar, String numIntentos, Fecha fecha) {
        this.Materia = Materia;
        this.Parcial = Parcial;
        this.Tema = Tema;
        this.numPReguntas = numPReguntas;
        this.pregRealizar = pregRealizar;
        this.numIntentos = numIntentos;
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getParcial() {
        return Parcial;
    }

    public void setParcial(String Parcial) {
        this.Parcial = Parcial;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public String getNumPReguntas() {
        return numPReguntas;
    }

    public void setNumPReguntas(String numPReguntas) {
        this.numPReguntas = numPReguntas;
    }

    public String getPregRealizar() {
        return pregRealizar;
    }

    public void setPregRealizar(String pregRealizar) {
        this.pregRealizar = pregRealizar;
    }

    public String getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(String numIntentos) {
        this.numIntentos = numIntentos;
    }

    @Override
    public String toString() {
        return "Examen{" + "Materia=" + Materia + ", Parcial=" + Parcial + ", Tema=" + Tema + ", numPReguntas=" + numPReguntas + ", pregRealizar=" + pregRealizar + ", numIntentos=" + numIntentos + ", fecha=" + fecha + '}';
    }
    
}
