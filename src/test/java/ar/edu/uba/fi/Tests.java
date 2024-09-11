package ar.edu.uba.fi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class Tests {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void usuarioConDosTarjetasTrabajadorVajaUnaVezConCada() {
        Tarjeta t1 = new Trabajador("id1");
        Tarjeta t2 = new Trabajador("id2");

        List<Viaje> viajes = Arrays.asList(
                new Viaje( "2024/09/01", 35, "id1"),
                new Viaje( "2024/09/03", 15, "id2"));

        Usuario joaco = new Usuario(t1, t2);

        assertEquals(
                (35 * 150) +
                        (15 * 150),
                joaco.calcularPagos(viajes),
                0.01
        );
    }

    @Test
    public void usuarioConDosTarjetasUnaExentoOtraTrabajadorVajaUnaVezConCada() {
        Tarjeta t1 = new Exento("id1");
        Tarjeta t2 = new Trabajador("id2");

        List<Viaje> viajes = Arrays.asList(
                new Viaje( "2024/09/01", 10, "id1"),
                new Viaje( "2024/09/20", 20, "id1"),
                new Viaje( "2024/09/22", 20, "id2"));

        Usuario joaco = new Usuario(t1, t2);

        assertEquals(
                (10 * 50) +
                        (20 * 150) +
                        (20 * 150),
                joaco.calcularPagos(viajes),
                0.01
        );
    }
}
