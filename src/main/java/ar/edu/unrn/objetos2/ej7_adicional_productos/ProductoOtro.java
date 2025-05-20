package ar.edu.unrn.objetos2.ej7_adicional_productos;

public class ProductoOtro extends Producto2 {
    private static final double IMPUESTOS = 0.15;
    private static final double DESCUENTO = 0.05;

    public ProductoOtro(double precio) {
        super(precio);
    }

    @Override
    public double obtenerImpuestos() {
        return IMPUESTOS;
    }

    @Override
    public double obtenerDescuentos() {
        return precio > 50 ? DESCUENTO : 0;
    }

    @Override
    public boolean tieneEnvioGratis() {
        return precio > 200;
    }
}
