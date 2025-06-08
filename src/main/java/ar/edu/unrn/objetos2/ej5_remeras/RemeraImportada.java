package ar.edu.unrn.objetos2.ej5_remeras;

public class RemeraImportada extends Remera {

    public static final float RECARGO = 0.03f;
    public static final float IMPUESTO_ADUANERO = 0.05f;
    public static final float RECARGO_FINAL = 0.25f;

    public RemeraImportada(float precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected float recargo(float precioUnitario) {
        return precioUnitario * RECARGO;
    }

    @Override
    protected float recargoFinal(float subTotal) {
        return subTotal * RECARGO_FINAL;
    }

    @Override
    protected float bonificacion(float precioUnitario) {
        return 0;
    }

    @Override
    protected float recargoTransporte(float precioUnitario) {
        return 0;
    }

    @Override
    protected float impuestoAduanero(float precioUnitario) {
        return precioUnitario * IMPUESTO_ADUANERO;
    }
}
