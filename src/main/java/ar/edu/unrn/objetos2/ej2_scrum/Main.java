package ar.edu.unrn.objetos2.ej2_scrum;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HistoriaDeUsuario historia1 = new HistoriaDeUsuario();
        Tarea tarea1 = new Tarea(Duration.ofHours(2));
        Tarea tarea2 = new Tarea(Duration.ofHours(4));
        Tarea spike = new Tarea(Duration.ofHours(9));

        historia1.agregarTarea(tarea1);
        historia1.agregarTarea(tarea2);

        Scrum scrum = new Scrum(List.of(historia1, spike));

        Duration duracion = scrum.calcularDuracion();
        System.out.println(convertirADuracionLegible(duracion));
    }

    public static String convertirADuracionLegible(Duration duration) {
        long horas = duration.toHours();
        long minutos = duration.minusHours(horas).toMinutes();

        StringBuilder resultado = new StringBuilder();
        if (horas > 0) {
            resultado.append(horas).append(horas == 1 ? " hora " : " horas ");
        }
        if (minutos > 0) {
            resultado.append(minutos).append(minutos == 1 ? " minuto " : " minutos ");
        }

        return resultado.toString().trim();
    }
}
