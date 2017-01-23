
package Objetos;

import java.io.Serializable;
import java.util.ArrayList;

public class Preguntas implements Serializable {
    
    private String Pregunta;
    private String RespuestaCorrecta;
    private String RespuestaIncorrecta1;
    private String RespuestaIncorrecta2;
    private String RespuestaIncorrecta3;

    public Preguntas(String Pregunta, String RespuestaCorrecta, String RespuestaIncorrecta1, String RespuestaIncorrecta2, String RespuestaIncorrecta3) {
        this.Pregunta = Pregunta;
        this.RespuestaCorrecta = RespuestaCorrecta;
        this.RespuestaIncorrecta1 = RespuestaIncorrecta1;
        this.RespuestaIncorrecta2 = RespuestaIncorrecta2;
        this.RespuestaIncorrecta3 = RespuestaIncorrecta3;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public String getRespuestaCorrecta() {
        return RespuestaCorrecta;
    }

    public void setRespuestaCorrecta(String RespuestaCorrecta) {
        this.RespuestaCorrecta = RespuestaCorrecta;
    }

    public String getRespuestaIncorrecta1() {
        return RespuestaIncorrecta1;
    }

    public void setRespuestaIncorrecta1(String RespuestaIncorrecta1) {
        this.RespuestaIncorrecta1 = RespuestaIncorrecta1;
    }

    public String getRespuestaIncorrecta2() {
        return RespuestaIncorrecta2;
    }

    public void setRespuestaIncorrecta2(String RespuestaIncorrecta2) {
        this.RespuestaIncorrecta2 = RespuestaIncorrecta2;
    }

    public String getRespuestaIncorrecta3() {
        return RespuestaIncorrecta3;
    }

    public void setRespuestaIncorrecta3(String RespuestaIncorrecta3) {
        this.RespuestaIncorrecta3 = RespuestaIncorrecta3;
    }

    @Override
    public String toString() {
        return "Preguntas{" + "Pregunta=" + Pregunta + ", RespuestaCorrecta=" + RespuestaCorrecta + ", RespuestaIncorrecta1=" + RespuestaIncorrecta1 + ", RespuestaIncorrecta2=" + RespuestaIncorrecta2 + ", RespuestaIncorrecta3=" + RespuestaIncorrecta3 + '}';
    }

}
