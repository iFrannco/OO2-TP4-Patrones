package ar.edu.unrn.objetos2.ej4_jubilados;


public class Jubilado extends Calculador {

    public static final double PORCENTAJE_SIN_PROMOCION = 0.1;

    public Jubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double obtenerPrecioSinPromocion(double precioProducto) {
        return precioProducto * PORCENTAJE_SIN_PROMOCION;
    }

    @Override
    protected double obtenerPrecioEnPromocion(double precioProducto) {
        return 0d;
    }

}
