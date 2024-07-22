package model;

public class Transporte {

    private String placa;
    private int tarifa;
    private TipoTarifa tipoTarifa;
    private TipoTransporte tipoTransporte;
    private int capacidad;

    public Transporte(){

    }

    public Transporte(String placa, int tarifa, TipoTarifa tipoTarifa, TipoTransporte tipoTransporte, int capacidad){
        this.placa = placa;
        this.tarifa = tarifa;
        this.tipoTarifa = tipoTarifa;
        this.tipoTransporte =  tipoTransporte;
        this.capacidad = capacidad;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getTarifa(){
        return this.tarifa;
    }

    public void setTarifa(int tarifa){
        this.tarifa = tarifa;
    }

    public TipoTarifa getTipoTarifa(){
        return this.tipoTarifa;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa){
        this.tipoTarifa = tipoTarifa;
    }

    public TipoTransporte getTipoTransporte(){
        return this.tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte){
        this.tipoTransporte = tipoTransporte;
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public int calcularGananciaTotal(){
        return this.capacidad * this.tarifa;
    }


}
