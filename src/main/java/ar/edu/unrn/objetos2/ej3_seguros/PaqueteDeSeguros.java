package ar.edu.unrn.objetos2.ej3_seguros;

import java.util.List;

public class PaqueteDeSeguros implements Seguro {
    public static final double descuento = 0.05;
    private List<Seguro> seguros;

    public PaqueteDeSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void agregarSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    @Override
    public float calcularCosto() {
        float total = 0;
        for (Seguro seguro : seguros) {
            total += seguro.calcularCosto() - (seguro.calcularCosto() * descuento);
        }
        return total;
    }
}
