package p3;

import p1.*;
import p2.TipoMatricula;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> matri = new ArrayList<>();
        matri.add(new MatriculaCampamento(100.2,30.2,90.2));
        matri.add(new MatriculaColegio(150.2, 140.2, 240.2, 300.4));
        matri.add(new MatriculaEscuela (50.2, 40.2, 140.2, 200.4));
        matri.add(new MatriculaJardin(50.2, 140.2, 40));
        matri.add(new MatriculaMaternal(50.2, 40.2, 80.2));
        for (Matricula matri1 : matri) {
            matri1.getTarifa();
        }

        TipoMatricula tipoMatricula = new TipoMatricula(matri);
        for (Matricula matricula : matri) {
            System.out.println(matricula);
            System.out.printf("Promedio Tarifa: %s, %n" , tipoMatricula.establecerPromedioTarifas());
        }
    }
}
