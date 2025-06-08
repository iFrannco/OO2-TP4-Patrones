package ar.edu.unrn.objetos2.ej2_scrum;

import java.time.Duration;
import java.util.List;

public class Scrum {
    private List<ItemDeTrabajo> itemsDeTrabajo;

    public Scrum(List<ItemDeTrabajo> itemsDeTrabajo) {
        this.itemsDeTrabajo = itemsDeTrabajo;
    }

    public Duration calcularDuracion() {
        Duration total = Duration.ZERO;
        for (ItemDeTrabajo item : itemsDeTrabajo) {
            total = total.plus(item.calcularDuracion());
        }
        return total;
    }
}
