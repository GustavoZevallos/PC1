package com.upc.pc1;

public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen(400,80,12,40);
        Almacen almacen1 = new Almacen(900,200,24,20);
        Galeria galeria = new Galeria(1400,300,6,8);
        Galeria galeria1 = new Galeria(1200,1000,18,25);
        TiendaEspecializada tiendaEspecializada = new TiendaEspecializada(600,50,8,"panaderia");
        TiendaEspecializada tiendaEspecializada1 = new TiendaEspecializada(800,75,6,"electronicos");

        //Implementar lo necesario para mostrar todos los datos en pantalla
        System.out.println("Datos del Almacen 1\n" + almacen.obtenerDatos());
        System.out.println("********************************************************");
        System.out.println("Datos del Almacen 2\n" + almacen1.obtenerDatos());
        System.out.println("********************************************************");
        System.out.println("Datos de la Galeria 1\n" + galeria.obtenerDatos());
        System.out.println("********************************************************");
        System.out.println("Datos de la Galeria 2\n" + galeria1.obtenerDatos());
        System.out.println("********************************************************");
        System.out.println("Datos de la Tienda Especializada 1\n" + tiendaEspecializada.obtenerDatos());
        System.out.println("********************************************************");
        System.out.println("Datos de la Tienda Especializada 2\n" + tiendaEspecializada1.obtenerDatos());
        System.out.println("********************************************************");

        //Implementar el método que permite calcular el precio final de alquiler de cualquier tipo de local comercial y mostrar en pantalla el resultado.
        System.out.println("Precio de Alquiler Total del Almacen 1\n" + almacen.calcularAlquilerTotal());
        System.out.println("********************************************************");
        System.out.println("Precio de Alquiler Total del  Almacen 2\n" + almacen1.calcularAlquilerTotal());
        System.out.println("********************************************************");
        System.out.println("Precio de Alquiler Total del Galeria 1\n" + galeria.calcularAlquilerTotal());
        System.out.println("********************************************************");
        System.out.println("Precio de Alquiler Total del Galeria 2\n" + galeria1.calcularAlquilerTotal());
        System.out.println("********************************************************");
        System.out.println("Precio de Alquiler Total del Tienda Especializada 1\n" + tiendaEspecializada.calcularAlquilerTotal());
        System.out.println("********************************************************");
        System.out.println("Precio de Alquiler Total del Tienda Especializada 2\n" + tiendaEspecializada1.calcularAlquilerTotal());
        System.out.println("********************************************************");


    }
}
