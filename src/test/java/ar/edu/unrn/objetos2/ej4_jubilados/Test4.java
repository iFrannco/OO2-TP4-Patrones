package ar.edu.unrn.objetos2.ej4_jubilados;

import org.junit.Test;

import java.time.Month;

import static org.junit.Assert.assertEquals;

public class Test4 {

    @Test
    public void testJubiladoDiaConDescuento() {
        // set up
        var jubilado = new Jubilado(3);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(100d, resultado, 0.01);
    }

    @Test
    public void testJubiladoDiaSinDescuento() {
        // set up
        var jubilado = new Jubilado(1);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(110d, resultado, 0.01);
    }

    @Test
    public void testNoJubiladoDiaSinDescuento() {
        // set up
        var jubilado = new NoJubilado(1);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(121d, resultado, 0.01);
    }

    @Test
    public void testNoJubiladoDiaConDescuento() {
        // set up
        var jubilado = new NoJubilado(3);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(115d, resultado, 0.01);
    }

}
