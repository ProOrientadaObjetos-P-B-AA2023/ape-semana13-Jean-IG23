package paquete01;

public class Televisor {
    private String marca;
    private double precio;

    public Televisor(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "TV: " + obtenerMarca() + "\nPrecio: " + obtenerPrecio() + "\n";
    }
}
