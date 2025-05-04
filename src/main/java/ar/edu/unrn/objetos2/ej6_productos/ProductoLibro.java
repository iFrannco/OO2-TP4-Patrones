package ar.edu.unrn.objetos2.ej6_productos;

public class ProductoLibro extends Producto {
    public static final double IMPUESTOS = 0.1;
    public static final double DESCUENTO = 0.1;

    public ProductoLibro(double precio) {
        super(precio);
    }

    public boolean aplicaDescuentoEnvio() {
        return precio > 100;
    }

    public double calcularPrecio() {
        return precio * (1 + IMPUESTOS) * (1 - DESCUENTO);
    }

}
