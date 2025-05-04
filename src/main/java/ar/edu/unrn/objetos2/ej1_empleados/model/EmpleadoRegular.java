package ar.edu.unrn.objetos2.ej1_empleados.model;

public class EmpleadoRegular extends Trabajador {
    private float sueldo;
    private String nombre;

    public EmpleadoRegular(String nombre, float sueldo) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    @Override
    float calcularSueldo() {
        return this.sueldo;
    }
}
