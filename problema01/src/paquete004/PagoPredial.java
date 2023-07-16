package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pagos{
    public double valorPropiedad;
    public double porcentaje;

    public PagoPredial(double valorPropiedad, double porcentaje) {
        this.valorPropiedad = valorPropiedad;
        this.porcentaje = porcentaje;
    }

    public void calcularPagos() {
        pagos = valorPropiedad - ((valorPropiedad*porcentaje)/100);
    }

    @Override
    public String toString() {
        return super.toString() + "PagoPredial{" +
                "valorPropiedad=" + valorPropiedad +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
