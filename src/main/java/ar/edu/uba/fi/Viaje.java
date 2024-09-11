package ar.edu.uba.fi;

public class Viaje {
    private String fecha;
    private int distanciaEnKm;
    private String numero;

    public Viaje(String fecha, int distanciaEnKm, String numero) {

        this.fecha = fecha;
        this.distanciaEnKm = distanciaEnKm;
        this.numero = numero;
    }

    public double multiplicarConPor(String numero, double precioPorDistancia) {
        if (! numero.equalsIgnoreCase(this.numero)) {
            return 0;
        }

        return distanciaEnKm * precioPorDistancia;
    }

    public double multiplicarConEnPor(String numero, String fechaDesde, String fechaHasta, double precioPorDistancia) {
        if (! numero.equalsIgnoreCase(this.numero)) {
            return 0;
        }

        if ( fecha.compareTo(fechaDesde) >= 0 && fecha.compareTo(fechaHasta) < 0) {
            return distanciaEnKm * precioPorDistancia;
        }

        return 0;
    }
}
