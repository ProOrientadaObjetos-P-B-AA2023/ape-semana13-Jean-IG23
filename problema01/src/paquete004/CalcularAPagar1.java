package paquete004;

import java.util.ArrayList;

public class CalcularAPagar1{
    public ArrayList<PagoAguaPotable> aguaPotable;
    public ArrayList<PagoLuzElectrica> luzElectrica;
    public ArrayList<PagoPredial> predio;
    public ArrayList<PagoTelefonoConvencional> telefono;

    public CalcularAPagar1(ArrayList<PagoAguaPotable> aguaPotable, ArrayList<PagoLuzElectrica> luzElectrica, ArrayList<PagoPredial> predio, ArrayList<PagoTelefonoConvencional> telefono) {
        this.aguaPotable = aguaPotable;
        this.luzElectrica = luzElectrica;
        this.predio = predio;
        this.telefono = telefono;
    }

    public double calcularAPagar1() {
        double gasto = 0;
        for (Pagos pago : aguaPotable) {
            gasto = gasto + pago.pagos;
        }
        for (Pagos pago : luzElectrica) {
            gasto = gasto + pago.pagos;
        }
        for (Pagos pago : predio ) {
            gasto = gasto + pago.pagos;
        }
        for (Pagos pago : telefono) {
            gasto = gasto + pago.pagos;
        }
        return gasto;
        }
    }
