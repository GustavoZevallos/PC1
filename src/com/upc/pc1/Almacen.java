package com.upc.pc1;

public class Almacen extends LocalComercial {

    private int cantidadTiposProductos;

    public Almacen(double precioAlquiler, int areaMt2, int mesesAlquiler, int cantidadTiposProductos) {
        super(precioAlquiler, areaMt2, mesesAlquiler);
        this.cantidadTiposProductos = cantidadTiposProductos;
    }

    @Override
    public double calcularAlquilerTotal() {
        return super.calcularAlquilerTotal();
    }

    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\nCantidad de tipos de Producto: " + getCantidadTiposProductos();
    }

    public int getCantidadTiposProductos() {
        return cantidadTiposProductos;
    }

    public void setCantidadTiposProductos(int cantidadTiposProductos) {
        this.cantidadTiposProductos = cantidadTiposProductos;
    }
}
