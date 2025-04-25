package ar.edu.unrn.objetos2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Trabajador> trabajadores = new ArrayList<>();

    public float calcularSueldos(){
        float resultado = 0;
        for (Trabajador trabajador: trabajadores){
            resultado += trabajador.obtenerSueldo();
        }
        return resultado;
    }

    public void agregarTrabajador(Trabajador trabajador){
        this.trabajadores.add(trabajador);
    }
}
