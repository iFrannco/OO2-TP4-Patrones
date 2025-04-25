package ar.edu.unrn.objetos2;

import java.util.ArrayList;
import java.util.List;

public class LiderDeProyecto extends Trabajador{
    List<EmpleadoRegular> empleados = new ArrayList<>();
    private float sueldo;
    private String nombre;

    public LiderDeProyecto(String nombre, float sueldo) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public float obtenerSueldo() {
        float resultado = 0;
        for(EmpleadoRegular empleado: empleados){
            resultado += empleado.obtenerSueldo();
        }
        return this.sueldo + resultado;
    }

    public void agregarEmpleadoRegular(EmpleadoRegular empleadoRegular) {
        this.empleados.add(empleadoRegular);
    }
}
