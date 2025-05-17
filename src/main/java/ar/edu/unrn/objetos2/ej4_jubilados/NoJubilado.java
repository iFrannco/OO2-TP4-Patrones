package ar.edu.unrn.objetos2.ej4_jubilados;

public class NoJubilado extends Calculador {

    public static final double PORCENTAJE_SIN_PROMOCION = 0.21;
    public static final double PORCENTAJE_EN_PROMOCION = 0.15;

    public NoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double obtenerPrecioSinPromocion(double precioProducto) {
        return precioProducto * PORCENTAJE_SIN_PROMOCION;
    }

    @Override
    protected double obtenerPrecioEnPromocion(double precioProducto) {
        return precioProducto * PORCENTAJE_EN_PROMOCION;
    }
}
