package ar.edu.unrn.objetos2.ej3_seguros;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SeguroSimple seguroMedico = new SeguroSimple(43023);
        SeguroSimple seguroAuto = new SeguroSimple(2349);
        SeguroSimple seguroDeVida = new SeguroSimple(5340);

        PaqueteDeSeguros paqueteDeSeguros = new PaqueteDeSeguros(List.of(
                seguroMedico, seguroAuto, seguroDeVida));

        float costoTotal = paqueteDeSeguros.calcularCosto();
        System.out.println(costoTotal);
    }
}
