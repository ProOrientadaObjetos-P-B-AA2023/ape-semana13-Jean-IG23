/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class VentasTvs {
    double precioTotal;
    ArrayList<Televisor> televisores;

    public VentasTvs(double precioTotal, ArrayList<Televisor> televisores) {
        this.precioTotal = precioTotal;
        this.televisores = televisores;
    }

    public double televisorMasCaro(ArrayList<Televisor> t){
        double s = televisores.get(0).obtenerPrecio();
        for (int i = 0; i < televisores.size(); i++) {
            if(televisores.get(i).obtenerPrecio() > s) {
                s = televisores.get(i).obtenerPrecio();
            }
        }
        return s;
    }

    public void establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
        }
        precioTotal = s;
    }

    public double obtenerPrecioTotal(){
        return precioTotal;
    }

    public String listaMarcasVendidas(ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        return s;
    }
    
}
