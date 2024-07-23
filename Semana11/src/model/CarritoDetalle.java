package model;

public class CarritoDetalle {
    private Carrito carrito;
    private Producto producto;
    private int cantidadComprar;
    private double totalPorProducto;

    public CarritoDetalle(){
        
    }

    public Carrito getCarrito() {
        return carrito;
    }
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidadComprar() {
        return cantidadComprar;
    }
    public void setCantidadComprar(int cantidadComprar) {
        this.cantidadComprar = cantidadComprar;
    }
    public double getTotalPorProducto() {
        return totalPorProducto;
    }
    public void setTotalPorProducto(double totalPorProducto) {
        this.totalPorProducto = totalPorProducto;
    }


    
}
