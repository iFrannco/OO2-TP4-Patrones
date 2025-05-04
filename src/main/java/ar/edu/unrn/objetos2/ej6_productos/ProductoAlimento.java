package ar.edu.unrn.objetos2.ej6_productos;

public class ProductoAlimento extends Producto {
    public static final double IMPUESTOS = 0.05;
    public static final double DESCUENTO = 0.15;

    public ProductoAlimento(double precio) {
        super(precio);
    }

    public boolean aplicaDescuentoEnvio() {
        return precio > 200;
    }

    public double calcularPrecio() {
        return precio > 100 ? precio * (1 + IMPUESTOS) * (1 - DESCUENTO) : precio * (1 + IMPUESTOS);
    }
}
