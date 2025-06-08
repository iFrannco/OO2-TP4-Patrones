package ar.edu.unrn.objetos2.ej4_jubilados;

import java.time.Month;

import static java.time.Month.of;

public abstract class Calculador {
    private LogTransaction log;
    private int mesEnPromocion;

    public Calculador(int mesEnPromocion, LogTransaction log) {
        this.mesEnPromocion = mesEnPromocion;
        this.log = log;
    }

    public final double calcularPrecio(double precioProducto, Month mesActual) {
        double precioTotal = precioProducto;
        if (esMesEnPromocion(mesActual)) {
            precioTotal += obtenerPrecioEnPromocion(precioProducto);
        } else {
            precioTotal += obtenerPrecioSinPromocion(precioProducto);
        }
        log.log(this.getClass().getName());
        return precioTotal;
    }

    protected abstract double obtenerPrecioSinPromocion(double precioProducto);

    protected abstract double obtenerPrecioEnPromocion(double precioProducto);

    protected boolean esMesEnPromocion(Month mesActual) {
        return of(mesEnPromocion).equals(mesActual);
    }


}
