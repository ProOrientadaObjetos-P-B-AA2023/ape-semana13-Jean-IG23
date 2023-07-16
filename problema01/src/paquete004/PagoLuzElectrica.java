package paquete004;

import paquete002.Ciudad;

public class PagoLuzElectrica extends Pagos{
    public Ciudad ciudad;
    public double tarifa;
    public double kilovatiosConsumidos;
    double costoKilovatio;

    public PagoLuzElectrica(Ciudad ciudad, double tarifa, double kilovatiosConsumidos, double costoKilovatio) {
        this.ciudad = ciudad;
        this.tarifa = tarifa;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    public void calcularPagos() {
        if (ciudad.equals("Loja")) {
            pagos = tarifa + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pagos = tarifa + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "PagoLuzElectrica{" +
                "ciudad='" + ciudad + '\'' +
                ", tarifa=" + tarifa +
                ", kilovatiosConsumidos=" + kilovatiosConsumidos +
                ", costoKilovatio=" + costoKilovatio +
                '}';
    }

}
