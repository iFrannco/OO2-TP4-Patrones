package ar.edu.unrn.objetos2.ej5_remeras;

abstract class Remera {
    protected float precioUnitario;

    public Remera(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final float calcularPrecio() {
        float recargo = recargo(precioUnitario);
        float impuestoAduanero = impuestoAduanero(precioUnitario);
        float recargoTransporte = recargoTransporte(precioUnitario);
        float bonificacion = bonificacion(precioUnitario);
        float subtotal = precioUnitario + recargo + impuestoAduanero + recargoTransporte + bonificacion;
        return recargoFinal(subtotal) + subtotal;
    }

    protected abstract float recargo(float precioUnitario);

    protected abstract float recargoFinal(float subtotal);

    protected abstract float bonificacion(float precioUnitario);

    protected abstract float recargoTransporte(float precioUnitario);

    protected abstract float impuestoAduanero(float precioUnitario);
}
