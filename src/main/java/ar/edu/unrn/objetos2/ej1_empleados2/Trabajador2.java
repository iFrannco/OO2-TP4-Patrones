package ar.edu.unrn.objetos2.ej1_empleados2;

import java.util.ArrayList;
import java.util.List;

public abstract class Trabajador2 {
    private List<Trabajador2> trabajadores;
    private float sueldo;

    protected Trabajador2(float sueldo) {
        this.sueldo = sueldo;
        this.trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador2 trabajador) {
        if (this.puedeSerJefeDe(trabajador)) {
            trabajadores.add(trabajador);
        }
    }

    public float calcularSueldo() {
        float sueldoTotal = sueldo;
        for (Trabajador2 trabajador2 : trabajadores) {
            sueldoTotal += trabajador2.calcularSueldo();
        }
        return sueldoTotal;
    }

    public abstract boolean puedeSerJefeDe(Trabajador2 trabajador);

    public abstract boolean puedeSerSubordinadoDe(Director director);

    public abstract boolean puedeSerSubordinadoDe(EmpleadoRegular2 empleadoRegular2);

    public abstract boolean puedeSerSubordinadoDe(Gerente gerente);

    public abstract boolean puedeSerSubordinadoDe(LiderDeProyecto liderDeProyecto);

    public abstract boolean puedeSerSubordinadoDe(MandoMedio mandoMedio);
}
