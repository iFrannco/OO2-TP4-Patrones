package ar.edu.unrn.objetos2.ej7_adicional_productos;

public class ProductoMedicina extends Producto2 {
    private static final double IMPUESTOS = 0;
    private static final double DESCUENTO = 0.1;

    public ProductoMedicina(double precio) {
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
        return precio > 100;
    }
}
