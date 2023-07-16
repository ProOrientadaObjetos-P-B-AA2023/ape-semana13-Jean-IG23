package p1;

public class MatriculaColegio extends Matricula{
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    private double costoLaboratorios;

    public MatriculaColegio(double costoDeportes, double costoFolletos, double costoUniformes, double costoLaboratorios) {
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniformes = costoUniformes;
        this.costoLaboratorios = costoLaboratorios;
    }

    public void precioTarifa() {
        super.setTarifa(costoDeportes + costoFolletos + costoLaboratorios + costoUniformes);
    }

    @Override
    public String toString() {
        return super.toString() + "MatriculaColegio{" +
                "costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniformes=" + costoUniformes +
                ", costoLaboratorios=" + costoLaboratorios +
                '}';
    }
}
