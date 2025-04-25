package ar.edu.unrn.objetos2;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Trabajador{
    List<MandoMedio> mandosmedios = new ArrayList<>();
    private float sueldo;
    private String nombre;

    public Gerente(String nombre, float sueldo) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public float obtenerSueldo() {
        float resultado = 0;
        for(MandoMedio mandoMedio: mandosmedios){
            resultado += mandoMedio.obtenerSueldo();
        }
        return this.sueldo + resultado;
    }

    public void agregarMandoMedio(MandoMedio mandoMedio) {
        this.mandosmedios.add(mandoMedio);
    }
}
