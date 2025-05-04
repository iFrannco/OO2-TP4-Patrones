package ar.edu.unrn.objetos2.ej6_productos;

public abstract class Producto {
    protected static final double PRECIO_ENVIO = 10;
    protected double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double descontarEnvio(double costo) {
        if (aplicaDescuentoEnvio()) {
            return costo - PRECIO_ENVIO;
        }
        return costo;
    }

    public abstract boolean aplicaDescuentoEnvio();

    public double precioFinal() {
        double subtotal = calcularPrecio();
        double costoFinal = descontarEnvio(subtotal);
        return costoFinal;
    }

    protected abstract double calcularPrecio();

}
