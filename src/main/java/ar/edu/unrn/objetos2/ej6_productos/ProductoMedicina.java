package ar.edu.unrn.objetos2.ej6_productos;

public class ProductoMedicina extends Producto {
    public static final double IMPUESTOS = 0;
    public static final double DESCUENTO = 0.1;

    public ProductoMedicina(double precio) {
        super(precio);
    }

    public boolean aplicaDescuentoEnvio() {
        return precio > 100;
    }

    public double calcularPrecio() {
        return precio > 50 ? precio * (1 + IMPUESTOS) * (1 - DESCUENTO) : precio * (1 + IMPUESTOS);
    }
}
