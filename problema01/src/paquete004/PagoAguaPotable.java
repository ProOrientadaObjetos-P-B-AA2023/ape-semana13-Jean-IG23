package paquete004;

public class PagoAguaPotable extends Pagos{
    public String servicio;
    public double tarifa;
    public double metroCubicosConsumo;
    public double costoConsumoCubicos;

    public PagoAguaPotable( String servicio, double tarifa, double metroCubicosConsumo, double costoConsumoCubicos) {
        this.servicio = servicio;
        this.tarifa = tarifa;
        this.metroCubicosConsumo = metroCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public void calcularPagos() {
        if (servicio.equals("comercial")) {
            pagos = tarifa + (metroCubicosConsumo * costoConsumoCubicos) + 15;
        }else{
            pagos = tarifa + (metroCubicosConsumo * costoConsumoCubicos);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "PagoAguaPotable{" +
                "servicio='" + servicio + '\'' +
                ", tarifa=" + tarifa +
                ", metroCubicosConsumo=" + metroCubicosConsumo +
                ", costoConsumoCubicos=" + costoConsumoCubicos +
                '}';
    }
}
