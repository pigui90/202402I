package modelQuiz;


public class Cuenta {
    private int numeroCuenta;
    private double montoTotal;
    private ClienteBanco cliente;
    private boolean tieneTarjeta;
    private TipoMoneda tipoMoneda;
    private TipoCuenta tipoCuenta;

    public Cuenta(){

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public ClienteBanco getCliente() {
        return cliente;
    }
    public void setCliente(ClienteBanco cliente) {
        this.cliente = cliente;
    }
    public boolean getTieneTarjeta() {
        return tieneTarjeta;
    }
    public void setTieneTarjeta(boolean tieneTarjeta) {
        this.tieneTarjeta = tieneTarjeta;
    }
    public TipoMoneda getTipoMoneda() {
        return tipoMoneda;
    }
    public void setTipoMoneda(TipoMoneda tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double sumarMovimientosCuenta(){
        return 0.0;
    }
    
}
