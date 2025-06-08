package ar.edu.unrn.objetos2.ej1_empleados.model;

public class EmpleadoRegular extends Trabajador {

    public EmpleadoRegular(String nombre, float sueldo) {
        super(nombre, sueldo);
    }

    @Override
    float calcularSueldo() {
        return this.sueldo;
    }
}
