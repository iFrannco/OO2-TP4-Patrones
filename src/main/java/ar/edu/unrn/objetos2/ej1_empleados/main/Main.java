package ar.edu.unrn.objetos2.ej1_empleados.main;

import ar.edu.unrn.objetos2.ej1_empleados.model.CargoJerarquico;
import ar.edu.unrn.objetos2.ej1_empleados.model.EmpleadoRegular;
import ar.edu.unrn.objetos2.ej1_empleados.model.Empresa;

public class Main {
    public static void main(String[] args) {
        var director1 = new CargoJerarquico("mauricio", 2000);
        var gerente1 = new CargoJerarquico("agustina", 4000);
        var mediosMando1 = new CargoJerarquico("federico", 2300);
        var lider1 = new CargoJerarquico("geremias", 4200);
        var empleadoRegular1 = new EmpleadoRegular("lucia", 3000);

        director1.agregarTrabajador(gerente1);
        gerente1.agregarTrabajador(mediosMando1);
        mediosMando1.agregarTrabajador(lider1);
        lider1.agregarTrabajador(empleadoRegular1);

        var empresa = new Empresa(director1);

        float sueldos = empresa.calcularSueldos();
        System.out.println(sueldos);
    }
}