package com.upc.pc1;

public class TiendaEspecializada extends LocalComercial {

    private String tipoDeProducto;

    public TiendaEspecializada(double precioAlquiler, int areaMt2, int mesesAlquiler, String tipoDeProducto) {
        super(precioAlquiler, areaMt2, mesesAlquiler);
        this.tipoDeProducto = tipoDeProducto;
    }

    @Override
    public double calcularAlquilerTotal() {
        if(tipoDeProducto.equals("panaderia")){
            return super.calcularAlquilerTotal()+(super.calcularAlquilerTotal()*0.05);
        }else if(tipoDeProducto.equals("muebleria")){
            return super.calcularAlquilerTotal()+(super.calcularAlquilerTotal()*0.07);
        }else if (tipoDeProducto.equals("electronicos")){
            return super.calcularAlquilerTotal()+(super.calcularAlquilerTotal()*0.09);
        }return super.calcularAlquilerTotal();
    }

    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\nTipo de Producto: " + getTipoDeProducto();
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }
}
