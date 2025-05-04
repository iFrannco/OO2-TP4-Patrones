package ar.edu.unrn.objetos2.ej2_scrum;

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
