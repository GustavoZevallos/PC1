package com.upc.pc1;

public class Galeria extends LocalComercial {

    private int puestosInternos;

    public Galeria(double precioAlquiler, int areaMt2, int mesesAlquiler, int puestosInternos) {
        super(precioAlquiler, areaMt2, mesesAlquiler);
        this.puestosInternos = puestosInternos;
    }

    @Override
    public double calcularAlquilerTotal() {
        if (puestosInternos > 10){
            return super.calcularAlquilerTotal() + (super.calcularAlquilerTotal()*0.10);
        }else {
            return super.calcularAlquilerTotal();
        }
    }

    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\nPuestos Internos: " + getPuestosInternos();
    }

    public int getPuestosInternos() {
        return puestosInternos;
    }

    public void setPuestosInternos(int puestosInternos) {
        this.puestosInternos = puestosInternos;
    }
}
