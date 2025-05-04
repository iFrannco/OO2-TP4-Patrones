package ar.edu.unrn.objetos2.ej1_empleados.model;

public class Empresa {
    private Trabajador jefe;

    public Empresa(Trabajador jefe) {
        this.jefe = jefe;
    }

    public float calcularSueldos() {
        return jefe.calcularSueldo();
    }

}
