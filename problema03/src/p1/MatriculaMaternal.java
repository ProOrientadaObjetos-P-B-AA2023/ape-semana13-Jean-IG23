package p1;

public class MatriculaMaternal extends Matricula{
    private double costoDesayuno;
    private double costoAlmuerzo;
    private double costoMedico;

    public MatriculaMaternal(double costoDesayuno, double costoAlmuerzo, double costoMedico) {
        this.costoDesayuno = costoDesayuno;
        this.costoAlmuerzo = costoAlmuerzo;
        this.costoMedico = costoMedico;
    }

    public void precioTarifa() {
        super.setTarifa(costoDesayuno + costoAlmuerzo + costoMedico);
    }

    @Override
    public String toString() {
        return super.toString() + "MatriculaMaternal{" +
                "costoDesayuno=" + costoDesayuno +
                ", costoAlmuerzo=" + costoAlmuerzo +
                ", costoMedico=" + costoMedico +
                '}';
    }
}
