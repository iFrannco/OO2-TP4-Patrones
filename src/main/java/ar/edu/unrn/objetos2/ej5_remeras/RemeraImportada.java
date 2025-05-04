package ar.edu.unrn.objetos2.ej5_remeras;

public class RemeraImportada extends Remera {

    public static final float RECARGO = 0.03f;
    public static final float IMPUESTO_ADUANERO = 0.05f;

    @Override
    public float calcularPrecio() {
        float conRecargo = precioUnitario + (precioUnitario * RECARGO);
        float conImpuestoAduanero = conRecargo + (conRecargo * IMPUESTO_ADUANERO);
        return conImpuestoAduanero;
    }
}
