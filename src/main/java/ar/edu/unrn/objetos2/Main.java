package ar.edu.unrn.objetos2;

public class Main {
    public static void main(String[] args) {

        var empresa = new Empresa();

        var director1 = new Director("santiago", 4000);
        var gerente1 = new Gerente("matias", 3000);
        var mediosMando1 = new MandoMedio("luciano", 2000);
        var lider1 = new LiderDeProyecto("lorena", 4000);
        var empleadoRegular1 = new EmpleadoRegular("pamela", 5000);

        director1.agregarGerente(gerente1);
        gerente1.agregarMandoMedio(mediosMando1);
        mediosMando1.agregarLider(lider1);
        lider1.agregarEmpleadoRegular(empleadoRegular1);

        empresa.agregarTrabajador(director1);

        float sueldos = empresa.calcularSueldos();

        System.out.println(sueldos);
    }
}