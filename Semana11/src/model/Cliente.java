package model;

public class Cliente {
    
    private int id;
    private String nombre;
    private String codigo;
    private int identificacion;
    private TipoCliente tipoCliente;
    private String lugarResidencia;

    public Cliente(){

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public int getIdentificacion(){
        return this.identificacion;
    }

    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }

    public TipoCliente getTipoCliente(){
        return this.tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente){
        this.tipoCliente = tipoCliente;
    }

    public String getLugarResidencia(){
        return this.lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia){
        this.lugarResidencia = lugarResidencia;
    }

    public String mostrarInformacion(){
      return "El cliente " + getNombre() + " reside en " + getLugarResidencia() + " y es de tipo " + getTipoCliente().getDescripcion();  
    }

    public String mostrarCompras(){
        return "Cuando se trabajen los archivos o base de datos se podra mostrar la informacion con mayor facilidad";
    }

}
