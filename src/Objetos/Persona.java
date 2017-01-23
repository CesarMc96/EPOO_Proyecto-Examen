
package Objetos;

import java.io.Serializable;

public class Persona implements Serializable{
    private String Nombre;
    private String Usuario;
    private String Contrasena;
    private String Rol;
    private String Permitido;

    public Persona(String Nombre, String Usuario, String Contrasena, String Rol, String Permitido)  {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Rol = Rol;
        this.Permitido = Permitido;
    }

    public String getPermitido() {
        return Permitido;
    }

    public void setPermitido(String Permitido) {
        this.Permitido = Permitido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }   

    @Override
    public String toString() {
        String s = Nombre + Usuario + Contrasena +  Rol;
        return s;
    }
    
    
}
