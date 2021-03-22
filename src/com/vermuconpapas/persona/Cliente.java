package com.vermuconpapas.persona;

public class Cliente extends Persona{

    private int idCliente;
    private float compras;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int idCliente, float compras, String direccion) {
        this.idCliente = idCliente;
        this.compras = compras;
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getCompras() {
        return compras;
    }

    public void setCompras(float compras) {
        this.compras = compras;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", compras=" + compras +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
