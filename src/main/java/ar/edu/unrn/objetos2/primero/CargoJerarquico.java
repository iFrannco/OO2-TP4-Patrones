package ar.edu.unrn.objetos2.primero;

import java.util.ArrayList;
import java.util.List;

public class CargoJerarquico extends Trabajador {
    private List<Trabajador> trabajadores;
    private float sueldo;
    private String nombre;

    public CargoJerarquico(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador trabajador) {
        this.trabajadores.add(trabajador);
    }

    @Override
    float calcularSueldo() {
        float resultado = 0;
        for (Trabajador trabajador : trabajadores) {
            resultado += trabajador.calcularSueldo();
        }
        return resultado + this.sueldo;
    }
}
