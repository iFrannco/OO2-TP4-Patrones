package ar.edu.unrn.objetos2.ej7_adicional_productos;

public class ProductoLibro extends Producto2 {
    private static final double IMPUESTOS = 0.1;
    private static final double DESCUENTO = 0.1;


    public ProductoLibro(double precio) {
        super(precio);
    }


    @Override
    public double obtenerImpuestos() {
        return IMPUESTOS;
    }

    @Override
    public double obtenerDescuentos() {
        return DESCUENTO;
    }

    @Override
    public boolean tieneEnvioGratis() {
        return precio > 100;
    }
}
