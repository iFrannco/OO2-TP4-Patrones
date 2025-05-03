package ar.edu.unrn.objetos2.segundo;

import java.time.Duration;

public class Tarea extends ItemDeTrabajo {
    private Duration duracion;

    public Tarea(Duration duracion) {
        this.duracion = duracion;
    }

    @Override
    public Duration calcularDuracion() {
        return this.duracion;
    }
}
