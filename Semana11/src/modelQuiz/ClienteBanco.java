package modelQuiz;

import java.util.Date;

public class ClienteBanco {

    private String identificacion;
    private String nombre;
    private int edad;
    private Date fechaIngreso;

    public ClienteBanco(){

    }

    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrarCuentas(){
        System.out.println("Mostrando datos....");
    }
    
    public void mostrarInformacionCliente(){
        System.out.println("Identificacion: " + getIdentificacion());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre: " + getNombre());


    }



}
