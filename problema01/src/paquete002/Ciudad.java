package paquete002;

public class Ciudad {
    String nombreCiudad;

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombreCiudad='" + nombreCiudad + '\'' +
                '}';
    }
}
