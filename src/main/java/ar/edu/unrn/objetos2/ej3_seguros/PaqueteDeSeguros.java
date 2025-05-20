package ar.edu.unrn.objetos2.ej3_seguros;

import java.util.List;

public class PaqueteDeSeguros implements Seguro {
    public static final float DESCUENTO_BASE = 0.05f;
    private List<Seguro> seguros;

    public PaqueteDeSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void agregarSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    @Override
    public float calcularCosto() {
        float subTotal = 0f;
        int cantidad = 0;
        float descuento = 0;
        // float descuento = DESCUENTO_BASE * obtenerCantidadDeSeguros();
        for (Seguro seguro : seguros) {
            subTotal += seguro.calcularCosto();
            cantidad += seguro.esHoja();
        }
        descuento = cantidad * DESCUENTO_BASE;
        return subTotal - (subTotal * descuento);
    }

    @Override
    public int esHoja() {
        return 0;
    }

    public int obtenerCantidadDeSeguros() {
        return seguros.size();
    }
}
