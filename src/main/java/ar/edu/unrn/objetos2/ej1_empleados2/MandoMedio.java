package ar.edu.unrn.objetos2.ej1_empleados2;

public class MandoMedio extends Trabajador2 {

    public MandoMedio(float sueldo) {
        super(sueldo);
    }

    @Override
    public boolean puedeSerJefeDe(Trabajador2 trabajador) {
        return trabajador.puedeSerSubordinadoDe(this);
    }

    @Override
    public boolean puedeSerSubordinadoDe(Director director) {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDe(EmpleadoRegular2 empleadoRegular2) {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDe(Gerente gerente) {
        return true;
    }

    @Override
    public boolean puedeSerSubordinadoDe(LiderDeProyecto liderDeProyecto) {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDe(MandoMedio mandoMedio) {
        return false;
    }
}
