package ar.edu.unrn.objetos2.ej6_productos;

public class ProductoOtro extends Producto {
    public static final double IMPUESTOS = 0.15;
    public static final double DESCUENTO = 0.05;

    public ProductoOtro(double precio) {
        super(precio);
    }

    public boolean aplicaDescuentoEnvio() {
        return precio > 200;
    }

    public double calcularPrecio() {
        return precio > 50 ? precio * (1 + IMPUESTOS) * (1 - DESCUENTO) : precio * (1 + IMPUESTOS);
    }
}
