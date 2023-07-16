package p1;

public class MatriculaCampamento extends Matricula{

    private double costoComida;
    private double costoTransporte;
    private double costoInstructores;

    public MatriculaCampamento(double costoComida, double costoTransporte, double costoInstructores) {
        this.costoComida = costoComida;
        this.costoTransporte = costoTransporte;
        this.costoInstructores = costoInstructores;
    }

    @Override
    public void precioTarifa() {
        super.setTarifa(costoTransporte + costoComida + costoInstructores);
    }

    @Override
    public String toString() {
        return super.toString() + "MatriculaCampamento{" +
                "costoComida=" + costoComida +
                ", costoTransporte=" + costoTransporte +
                ", costoInstructores=" + costoInstructores +
                '}';
    }
}
