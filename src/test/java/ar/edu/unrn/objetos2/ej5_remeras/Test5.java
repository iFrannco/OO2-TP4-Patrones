package ar.edu.unrn.objetos2.ej5_remeras;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test5 {

    @Test
    public void RemeraNacional() {
        // Set up
        var remeraNacional = new RemeraNacional(100);

        // Excercise
        var resultado = remeraNacional.calcularPrecio();

        // Verify
        assertEquals(139.725, resultado, 0.01);
    }

    @Test
    public void RemeraImportada() {
        // Set up
        var remeraImportada = new RemeraImportada(100);

        // Excercise
        var resultado = remeraImportada.calcularPrecio();

        // Verify
        assertEquals(135, resultado, 0.01);
    }
}
