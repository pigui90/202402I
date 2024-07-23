package modelQuiz;

public class TipoMoneda {
    private int identificador;
    private String descripcion;
    private boolean activo;

    public TipoMoneda(){

    }

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrarTipos(){
        System.out.println("Mostrando info....");
    }
}
