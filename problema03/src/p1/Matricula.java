package p1;

public abstract class Matricula {
    private double tarifa;

    public Matricula(double tarifa) {
        this.tarifa = tarifa;
    }

    protected Matricula() {
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public abstract void precioTarifa();

    @Override
    public String toString() {
        return "Matricula{" +
                "tarifa=" + tarifa +
                '}';
    }
}
