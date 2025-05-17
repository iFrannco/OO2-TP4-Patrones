package ar.edu.unrn.objetos2.ej5_remeras;

public class RemeraNacional extends Remera {
    public static final float RECARGO_TRANSPORTE = 0.015f;
    public static final float BONIFICACION = 0.2f;
    public static final float RECARGO_FINAL = 0.15f;

    public RemeraNacional(float precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected float recargo(float precioUnitario) {
        return 0;
    }

    @Override
    protected float recargoFinal(float subTotal) {
        return subTotal * RECARGO_FINAL;
    }

    @Override
    protected float bonificacion(float precioUnitario) {
        return precioUnitario * BONIFICACION;
    }

    @Override
    protected float recargoTransporte(float precioUnitario) {
        return precioUnitario * RECARGO_TRANSPORTE;
    }

    @Override
    protected float impuestoAduanero(float precioUnitario) {
        return 0;
    }
}
