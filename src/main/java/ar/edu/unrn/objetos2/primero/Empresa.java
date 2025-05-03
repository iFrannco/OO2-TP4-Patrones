package ar.edu.unrn.objetos2.primero;

public class Empresa {
    private Trabajador jefe;

    public Empresa(Trabajador jefe) {
        this.jefe = jefe;
    }

    public float calcularSueldos() {
        return jefe.calcularSueldo();
    }

}
