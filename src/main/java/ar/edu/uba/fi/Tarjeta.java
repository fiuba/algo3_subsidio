package ar.edu.uba.fi;

public abstract class Tarjeta {
    protected String numeroTarjeta;
    protected double precioPorDistancia;

    public Tarjeta(String numeroTarjeta) {

        this.numeroTarjeta = numeroTarjeta;
        this.precioPorDistancia = 150;
    }

    public abstract double calcularElPagoEn(Viaje v);
}
