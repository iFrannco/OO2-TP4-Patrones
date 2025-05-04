package ar.edu.unrn.objetos2.ej4_jubilados;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {
    public static final double AUMENTO1 = 0.15;
    public static final double AUMENTO2 = 0.21;

    @Override
    public double calcularAumento(double precioProducto) {
        return of(super.mesEnPromocion).equals(now().getMonth()) ? precioProducto * AUMENTO1 : precioProducto * AUMENTO2;

    }

}
