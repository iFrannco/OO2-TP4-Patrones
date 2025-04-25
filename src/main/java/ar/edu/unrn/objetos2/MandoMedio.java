package ar.edu.unrn.objetos2;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio extends Trabajador{
    List<LiderDeProyecto> lideres = new ArrayList<>();
    private float sueldo;
    private String nombre;

    public MandoMedio(String nombre, float sueldo) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public float obtenerSueldo() {
        float resultado = 0;
        for(LiderDeProyecto lider: lideres){
            resultado += lider.obtenerSueldo();
        }
        return this.sueldo + resultado;
    }

    public void agregarLider(LiderDeProyecto lider) {
        this.lideres.add(lider);
    }

}
