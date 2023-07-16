package p1;

public class MatriculaJardin extends Matricula{
    private double costoDesayuno;
    private double costoLibro;
    private double costoPaseo;

    public MatriculaJardin(double costoDesayuno, double costoLibro, double costoPaseo) {
        this.costoDesayuno = costoDesayuno;
        this.costoLibro = costoLibro;
        this.costoPaseo = costoPaseo;
    }

    public void precioTarifa() {
        super.setTarifa(costoDesayuno + costoLibro + costoPaseo);
    }

    @Override
    public String toString() {
        return super.toString() + "MatriculaJardin{" +
                "costoDesayuno=" + costoDesayuno +
                ", costoLibro=" + costoLibro +
                ", costoPaseo=" + costoPaseo +
                '}';
    }
}
