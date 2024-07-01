package model;

import java.util.Date;

public class Estudiante {
    Date fechaNacimiento;
    int edad;
    public Estudiante(){
        this.fechaNacimiento = new Date(); 
        edad = 0;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
