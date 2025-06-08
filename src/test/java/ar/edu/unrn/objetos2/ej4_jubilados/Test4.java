package ar.edu.unrn.objetos2.ej4_jubilados;

import org.junit.Test;

import java.time.Month;

import static org.junit.Assert.assertEquals;

public class Test4 {

    @Test
    public void testJubiladoDiaConDescuento() {
        // set up
        var logTransaction = new LogTransactionFake();
        var jubilado = new Jubilado(3, logTransaction);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(100d, resultado, 0.01);
        assertEquals("ar.edu.unrn.objetos2.ej4_jubilados.Jubilado", logTransaction.getMensaje());
    }

    @Test
    public void testJubiladoDiaSinDescuento() {
        // set up
        var logTransaction = new LogTransactionFake();
        var jubilado = new Jubilado(1, logTransaction);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(110d, resultado, 0.01);
        assertEquals("ar.edu.unrn.objetos2.ej4_jubilados.Jubilado", logTransaction.getMensaje());

    }

    @Test
    public void testNoJubiladoDiaSinDescuento() {
        // set up
        var logTransaction = new LogTransactionFake();
        var jubilado = new NoJubilado(1, logTransaction);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(121d, resultado, 0.01);
        assertEquals("ar.edu.unrn.objetos2.ej4_jubilados.NoJubilado", logTransaction.getMensaje());

    }

    @Test
    public void testNoJubiladoDiaConDescuento() {
        // set up
        var logTransaction = new LogTransactionFake();
        var jubilado = new NoJubilado(3, logTransaction);

        // Excecute
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        // Verify
        assertEquals(115d, resultado, 0.01);
        assertEquals("ar.edu.unrn.objetos2.ej4_jubilados.NoJubilado", logTransaction.getMensaje());

    }

}
