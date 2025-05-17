package ar.edu.unrn.objetos2.ej1_empleados2;

public class EmpleadoRegular2 extends Trabajador2 {

    public EmpleadoRegular2(float sueldo) {
        super(sueldo);
    }

    public boolean puedeSerJefeDe(Trabajador2 trabajador) {
        return trabajador.puedeSerSubordinadoDe(this);
    }

    public boolean puedeSerSubordinadoDe(Director director) {
        return false;
    }

    public boolean puedeSerSubordinadoDe(EmpleadoRegular2 empleadoRegular2) {
        return false;
    }

    public boolean puedeSerSubordinadoDe(Gerente gerente) {
        return false;
    }

    public boolean puedeSerSubordinadoDe(LiderDeProyecto liderDeProyecto) {
        return true;
    }

    public boolean puedeSerSubordinadoDe(MandoMedio mandoMedio) {
        return false;
    }


}
