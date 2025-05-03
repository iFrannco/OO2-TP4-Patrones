package ar.edu.unrn.objetos2.segundo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario extends ItemDeTrabajo {
    private List<ItemDeTrabajo> tareas = new ArrayList<>();

    @Override
    Duration calcularDuracion() {
        Duration total = Duration.ZERO;
        for (ItemDeTrabajo item : tareas) {
            total = total.plus(item.calcularDuracion());
        }

        return total;
    }

    public void agregarTarea(ItemDeTrabajo tarea) {
        tareas.add(tarea);
    }

}
