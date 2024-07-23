package model;

public class TipoProducto {
    private int id;
    private String codigo;
    private String descripcion;

    public TipoProducto(){

    }

    public TipoProducto(int id, String codigo, String descripcion){
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String mostrarTiposProducto(){
        return "Tipos de producto";
    }

}
