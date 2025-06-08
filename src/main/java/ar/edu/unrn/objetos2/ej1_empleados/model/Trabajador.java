package ar.edu.unrn.objetos2.ej1_empleados.model;

abstract class Trabajador {
    protected String nombre;
    protected float sueldo;

    Trabajador(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    abstract float calcularSueldo();
}
