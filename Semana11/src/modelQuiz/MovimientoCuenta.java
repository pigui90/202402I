package modelQuiz;

public class MovimientoCuenta {
    private double monto;
    private boolean positivo;
    private Cuenta cuenta;

    public MovimientoCuenta(){

    }

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public boolean getPositivo() {
        return positivo;
    }
    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    
}
