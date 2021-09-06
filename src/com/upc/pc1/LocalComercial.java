package com.upc.pc1;

public class  LocalComercial {

    private double precioAlquiler;
    private int areaMt2;
    private int mesesAlquiler;

    public LocalComercial() {
    }

    public LocalComercial(double precioAlquiler, int areaMt2, int mesesAlquiler) {
        this.precioAlquiler = precioAlquiler;
        this.areaMt2 = areaMt2;
        this.mesesAlquiler = mesesAlquiler;
    }

    public double calcularAlquilerTotal(){
        return precioAlquiler*mesesAlquiler;
    }

    public String obtenerDatos(){
        return "Precio de Alquiler: " + getPrecioAlquiler() + "\nArea Mt2: " + getAreaMt2() + "\nMeses de alquiler: " + getMesesAlquiler();
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getAreaMt2() {
        return areaMt2;
    }

    public void setAreaMt2(int areaMt2) {
        this.areaMt2 = areaMt2;
    }

    public int getMesesAlquiler() {
        return mesesAlquiler;
    }

    public void setMesesAlquiler(int mesesAlquiler) {
        this.mesesAlquiler = mesesAlquiler;
    }


}
