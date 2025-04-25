package ar.edu.unrn.objetos2;

import java.util.ArrayList;
import java.util.List;

public class Jefe extends Trabajador{
    private List<Trabajador> trabajadores;
    private float sueldo;

    public Jefe(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.trabajadores = new ArrayList<>();
    }

    private String nombre;


    public void agregarTrabajador(Trabajador trabajador){
        this.trabajadores.add(trabajador);
    }

    public void quitarTrabajador(Trabajador trabajador){
        this.trabajadores.remove(trabajador);
    }

    @Override
    float obtenerSueldo() {
        float resultado = 0;
        for (Trabajador trabajador: trabajadores){
            resultado += trabajador.obtenerSueldo();
        }
        return resultado + this.sueldo;
    }
}
