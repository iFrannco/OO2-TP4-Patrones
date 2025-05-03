package ar.edu.unrn.objetos2.segundo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Scrum {
    private List<ItemDeTrabajo> itemsDeTrabajo = new ArrayList<>();

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
