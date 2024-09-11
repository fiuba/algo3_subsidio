package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final ArrayList<Tarjeta> tarjetas;

    public Usuario(Tarjeta t1, Tarjeta t2) {
        tarjetas = new ArrayList<Tarjeta>();

        tarjetas.add(t1);
        tarjetas.add(t2);
    }

    public double calcularPagos(List<Viaje> viajes) {
        double resultado = 0;
        for(Viaje v : viajes) {
            for(Tarjeta t : tarjetas) {
                resultado = resultado + t.calcularElPagoEn(v);
            }
        }

        return resultado;
    }
}
