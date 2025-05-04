package ar.edu.unrn.objetos2.ej3_seguros;

public class SeguroSimple implements Seguro {
    private float costo;

    public SeguroSimple(float costo) {
        this.costo = costo;
    }

    @Override
    public float calcularCosto() {
        return this.costo;
    }

}
