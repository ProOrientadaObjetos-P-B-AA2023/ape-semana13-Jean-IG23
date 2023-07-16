/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

import java.util.ArrayList;

public class BilleteraPagos {
    public Persona persona;
    public String mes;
    public ArrayList<PagoAguaPotable> aguaPotable;
    public ArrayList<PagoLuzElectrica> luzElectrica;
    public ArrayList<PagoPredial> predio;
    public ArrayList<PagoTelefonoConvencional> telefono;
    public double gastoPagos;

    public BilleteraPagos(Persona persona, String mes, ArrayList<PagoAguaPotable> aguaPotable, ArrayList<PagoLuzElectrica> luzElectrica, ArrayList<PagoPredial> predio, ArrayList<PagoTelefonoConvencional> telefono,double gastoPagos) {
        this.persona = persona;
        this.mes = mes;
        this.aguaPotable = aguaPotable;
        this.luzElectrica = luzElectrica;
        this.predio = predio;
        this.telefono = telefono;
        this.gastoPagos = gastoPagos;
    }

    public BilleteraPagos(){
    }

    @Override
    public String toString() {
        return "BilleteraPagos{" +
                "persona=" + persona +
                ", gastoPagos=" + gastoPagos +
                ", mes='" + mes + '\'' +
                ", aguaPotable=" + aguaPotable +
                ", luzElectrica=" + luzElectrica +
                ", predio=" + predio +
                ", telefono=" + telefono +
                '}';
    }
}
