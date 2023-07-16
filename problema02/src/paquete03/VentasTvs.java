package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    private double precioTotal;
    private ArrayList<Televisor> televisores;

    public VentasTvs(ArrayList<Televisor> televisores) {
        this.televisores = televisores;
    }

    public double obtenerPrecioTotal() {
        double total = 0;
        for (Televisor televisor : televisores) {
            total += televisor.obtenerPrecio();
        }
        precioTotal = total;
        return precioTotal;
    }

    public String obtenerMarcasVendidas() {
        String marcas = "";
        for (Televisor televisor : televisores) {
            marcas += televisor.obtenerMarca() + "\n";
        }
        return marcas;
    }

    public Televisor obtenerTelevisorMasCaro() {
        Televisor televisorMasCaro = televisores.get(0);
        for (Televisor televisor : televisores) {
            if (televisor.obtenerPrecio() > televisorMasCaro.obtenerPrecio()) {
                televisorMasCaro = televisor;
            }
        }
        return televisorMasCaro;
    }
}
