package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Televisor> televisores = new ArrayList<>();
        televisores.add(new Televisor("LG-14 pulgadas", 300.2));
        televisores.add(new Televisor("SAMSUNG-21 pulgadas", 1300.2));
        televisores.add(new Televisor("RIVIERA-29 pulgadas", 2300.5));

        System.out.println("-----------------");
        for (Televisor televisor : televisores) {
            System.out.println(televisor);
        }

        VentasTvs ventas = new VentasTvs(televisores);
        System.out.println("Televisor más caro: " + ventas.obtenerTelevisorMasCaro());
        System.out.println("Precio Total: " + ventas.obtenerPrecioTotal());
        System.out.println("Marcas Vendidas: \n" + ventas.obtenerMarcasVendidas());
    }
}
