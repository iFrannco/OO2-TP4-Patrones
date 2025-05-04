package ar.edu.unrn.objetos2.ej4_jubilados;

abstract class Calculador {
    protected int mesEnPromocion;
    // private LogTransaction log;

    public double calcularPrecio(double precioProducto) {
        // log.log(this.getClass().getName());
        return precioProducto + calcularAumento(precioProducto);
    }

    protected abstract double calcularAumento(double precioProducto);


}
