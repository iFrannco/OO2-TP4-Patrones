package ar.edu.unrn.objetos2.ej1_empleados2;

public class Main {
    public static void main(String[] args) {
        var director = new Director(3000);
        var trabadorRegular = new EmpleadoRegular2(4000);
        var gerente = new Gerente(7000);


        director.agregarTrabajador(trabadorRegular);
        director.agregarTrabajador(gerente);

        System.out.println(director.calcularSueldo());

    }
}
