package ar.edu.unrn.objetos2;

import java.util.ArrayList;
import java.util.List;

public class Director extends Trabajador{
    private List<Gerente> gerentes = new ArrayList<>();
    private float sueldo;
    private String nombre;

    public Director(String nombre, float sueldo) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }


    @Override
    float obtenerSueldo() {
        float resultado = 0;
        for(Gerente gerente: gerentes){
            resultado += gerente.obtenerSueldo();
        }
        return this.sueldo + resultado;
    }

    public void agregarGerente(Gerente gerente) {
        this.gerentes.add(gerente);
    }
}
