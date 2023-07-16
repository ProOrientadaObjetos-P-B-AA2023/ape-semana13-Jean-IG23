package p2;

import p1.Matricula;

import java.util.ArrayList;

public class TipoMatricula {
    ArrayList<Matricula> matri;

    public TipoMatricula(ArrayList<Matricula> matri) {
        this.matri = matri;
    }

    public double establecerPromedioTarifas() {
        double promedioM = 0;
        for (Matricula matri1 : matri) {
            promedioM = promedioM + matri1.getTarifa();
        }
        return promedioM / matri.size();
    }
}
