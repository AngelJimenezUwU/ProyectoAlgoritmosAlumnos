/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAlgoritmos;

import java.io.Serializable;

/**
 *
 * @author AngelUwU
 */
public class Alumno implements Serializable {
     private String Edad ;
    private String Carne;
    private String Nombres ;   
    private String Apellidos ;
    private String Sexo ;
    private String Carrera ;  
    private String TotalC;
    private String CCA;
    Cursos Cursos1;

    public Cursos getCursos1() {
        return Cursos1;
    }

    public void setCursos1(Cursos Cursos1) {
        this.Cursos1 = Cursos1;
    }

    
       public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String Carne) {
        this.Carne = Carne;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getTotalC() {
        return TotalC;
    }

    public void setTotalC(String TotalC) {
        this.TotalC = TotalC;
    }

    public String getCCA() {
        return CCA;
    }

    public void setCCA(String CCA) {
        this.CCA = CCA;
    }

}
