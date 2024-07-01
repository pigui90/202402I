package model;

public class Transporte {
    private String placa;
    private String color;
    int capacidad;

    public Transporte(){
        this.placa = "";
        this.color = "";
        capacidad = 0;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
        
    }

    public String getColor(){
            return this.color;
    }
}


