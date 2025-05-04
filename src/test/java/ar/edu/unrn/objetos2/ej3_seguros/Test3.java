package ar.edu.unrn.objetos2.ej3_seguros;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test3 {

    @Test
    public void primerTest() {

        // set up
        SeguroSimple seguroDeVida = new SeguroSimple(23000);
        SeguroSimple seguroMedico = new SeguroSimple(40000);
        SeguroSimple seguroAuto = new SeguroSimple(38000);

        PaqueteDeSeguros paqueteDeSeguros = new PaqueteDeSeguros(List.of(
                seguroDeVida, seguroMedico, seguroAuto));

        // excecute
        float costoTotal = paqueteDeSeguros.calcularCosto();

        // verify
        assertEquals(85850.0f, costoTotal, 0.0002);
    }

}
