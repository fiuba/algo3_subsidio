package ar.edu.uba.fi;

public class Exento extends Tarjeta {
    private final Trabajador trabajador;
    private String fechaDesde;
    private String fechaHasta;

    public Exento(String numeroTarjeta) {
        super(numeroTarjeta);

        fechaDesde = "2024/09/01";
        fechaHasta = "2024/09/15";
        trabajador = new Trabajador(numeroTarjeta);
    }

    @Override
    public double calcularElPagoEn(Viaje v) {
        double result = v.multiplicarConEnPor(numeroTarjeta, fechaDesde, fechaHasta, 50);

        if ( result <= 0 ) {
            return trabajador.calcularElPagoEn(v);
        }

        return result;
    }
}
