package ar.edu.unrn.objetos2.ej7_adicional_productos;


abstract class Producto2 {
    protected double precio;

    public Producto2(double precio) {
        this.precio = precio;
    }

    protected abstract double obtenerImpuestos();

    protected abstract double obtenerDescuentos();

    protected abstract boolean tieneEnvioGratis();

    public final double precioFinal() {
        double impuestos = obtenerImpuestos();
        double descuentos = obtenerDescuentos();
        boolean envioGratis = tieneEnvioGratis();

        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}
