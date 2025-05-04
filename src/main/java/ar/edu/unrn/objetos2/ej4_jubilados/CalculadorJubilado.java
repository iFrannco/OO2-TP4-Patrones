package ar.edu.unrn.objetos2.ej4_jubilados;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {
    public static final double AUMENTO1 = 0.1;

    @Override
    public double calcularAumento(double precioProducto) {
        return !of(mesEnPromocion).equals(now().getMonth()) ? precioProducto * AUMENTO1 : precioProducto;
    }


}
