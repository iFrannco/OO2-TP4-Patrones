package ar.edu.unrn.objetos2.ej2_scrum;

import org.junit.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2 {

    @Test
    public void tresTareasEnUnaHistoria() {
        // set up
        HistoriaDeUsuario historia1 = new HistoriaDeUsuario();
        Tarea tarea1 = new Tarea(Duration.ofHours(5));
        Tarea tarea2 = new Tarea(Duration.ofHours(14));
        Tarea spike = new Tarea(Duration.ofHours(8));

        historia1.agregarTarea(tarea1);
        historia1.agregarTarea(tarea2);

        Scrum scrum = new Scrum(List.of(historia1, spike));

        // excecute
        Duration duracion = scrum.calcularDuracion();

        // verify
        assertEquals(Duration.ofHours(27), duracion);
    }

    @Test
    public void ceroHoras() {
        // set up
        HistoriaDeUsuario historia1 = new HistoriaDeUsuario();

        Scrum scrum = new Scrum(List.of(historia1));

        // excecute
        Duration duracion = scrum.calcularDuracion();

        // verify
        assertEquals(Duration.ofHours(0), duracion);
    }

    @Test
    public void parteDeUnProyectoScrum() {
        // set up
        HistoriaDeUsuario historia1 = new HistoriaDeUsuario();
        HistoriaDeUsuario historia2 = new HistoriaDeUsuario();
        HistoriaDeUsuario historia3 = new HistoriaDeUsuario();
        Tarea tarea1 = new Tarea(Duration.ofHours(2));

        historia3.agregarTarea(tarea1);
        historia2.agregarTarea(historia3);
        historia1.agregarTarea(historia2);

        // excecute
        Duration duracion = historia3.calcularDuracion();

        // verify
        assertEquals(Duration.ofHours(2), duracion);
    }


}
