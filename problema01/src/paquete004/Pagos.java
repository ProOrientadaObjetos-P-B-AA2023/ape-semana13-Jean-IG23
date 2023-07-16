package paquete004;

import java.util.ArrayList;

public abstract class Pagos {
    public double pagos;

    protected Pagos() {
    }

    public abstract void calcularPagos();

    public Pagos(double pagos) {
        this.pagos = pagos;
    }

    @Override
    public String toString() {
        return "Pagos{" +
                "pagos=" + pagos +
                '}';
    }
}

