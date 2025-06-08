package ar.edu.unrn.objetos2.ej1_empleados.model;

import java.util.ArrayList;
import java.util.List;

public class CargoJerarquico extends Trabajador {
    private List<Trabajador> trabajadores;

    public CargoJerarquico(String nombre, float sueldo) {
        super(nombre, sueldo);
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
        return resultado + sueldo;
    }
}
