package ar.edu.unrn.objetos2.ej1_empleados;

import ar.edu.unrn.objetos2.ej1_empleados.model.CargoJerarquico;
import ar.edu.unrn.objetos2.ej1_empleados.model.EmpleadoRegular;
import ar.edu.unrn.objetos2.ej1_empleados.model.Empresa;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Test1 {

    @Test
    public void primerTest() {
        var director1 = new CargoJerarquico("santiago", 4000);
        var gerente1 = new CargoJerarquico("matias", 3000);
        var mediosMando1 = new CargoJerarquico("luciano", 2000);
        var lider1 = new CargoJerarquico("lorena", 4000);
        var empleadoRegular1 = new EmpleadoRegular("pamela", 5000);

        director1.agregarTrabajador(gerente1);
        gerente1.agregarTrabajador(mediosMando1);
        mediosMando1.agregarTrabajador(lider1);
        lider1.agregarTrabajador(empleadoRegular1);

        var empresa = new Empresa(director1);

        float sueldos = empresa.calcularSueldos();
        System.out.println(sueldos);

        assertEquals(18000.0f, sueldos);
    }

    @Test
    public void segundoTest() {
        var director1 = new CargoJerarquico("santiago", 4000);
        var gerente1 = new CargoJerarquico("matias", 3000);
        var gerente2 = new CargoJerarquico("jair", 3000);
        var mediosMando1 = new CargoJerarquico("luciano", 2000);
        var lider1 = new CargoJerarquico("lorena", 4000);
        var lider2 = new CargoJerarquico("mauricio", 4000);
        var empleadoRegular1 = new EmpleadoRegular("pamela", 5000);
        var empleadoRegular2 = new EmpleadoRegular("tiara", 5000);

        director1.agregarTrabajador(gerente1);
        director1.agregarTrabajador(gerente2);
        gerente1.agregarTrabajador(mediosMando1);
        mediosMando1.agregarTrabajador(lider1);
        mediosMando1.agregarTrabajador(lider2);
        lider1.agregarTrabajador(empleadoRegular1);
        lider1.agregarTrabajador(empleadoRegular2);

        var empresa = new Empresa(director1);

        float sueldos = empresa.calcularSueldos();
        System.out.println(sueldos);

        assertEquals(30000.0f, sueldos);
    }
}
