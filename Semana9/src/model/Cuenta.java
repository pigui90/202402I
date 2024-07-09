package model;

import java.util.Date;

public class Cuenta {
    int id;
    int numeroIban;
    Date vencimiento;
    double saldo;
    Cliente cliente;

    public Cuenta(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroIban() {
        return numeroIban;
    }

    public void setNumeroIban(int numeroIban) {
        this.numeroIban = numeroIban;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
