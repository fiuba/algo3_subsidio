package ar.edu.uba.fi;

public class Trabajador extends Tarjeta {

    public Trabajador(String numero) {
        super(numero);
    }

    @Override
    public double calcularElPagoEn(Viaje v) {
        return v.multiplicarConPor(numeroTarjeta, precioPorDistancia);
    }
}
