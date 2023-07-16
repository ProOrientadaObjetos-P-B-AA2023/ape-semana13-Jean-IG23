package p1;

public class MatriculaEscuela extends Matricula{
    private double costoLibro;
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniforme;

    public MatriculaEscuela(double costoLibro, double costoDeportes, double costoFolletos, double costoUniforme) {
        this.costoLibro = costoLibro;
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniforme = costoUniforme;
    }

    public void precioTarifa(){
        super.setTarifa(costoLibro + costoDeportes + costoFolletos + costoUniforme);
    }

    @Override
    public String toString() {
        return super.toString() + "MatriculaEscuela{" +
                "costoLibro=" + costoLibro +
                ", costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniforme=" + costoUniforme +
                '}';
    }
}
