package model;

public class TipoCliente {
    private int id;
    private String codigo;
    private String descripcion;

    public TipoCliente(){

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

    public String mostrarTiposCliente(){
        return "tipos de cliente";
    }
}
