/*
package ar.edu.unrn.objetos2.ej4_jubilados;

public class Borrador {
}

//import static java.time.LocalDate.now;
//import static java.time.Month.of;
public class CalculadorJubilado implements Calculador {
    //    private LogTransaction log;
//    private int mesEnPromocion;
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.1;
        }
        log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }
}

//import static java.time.LocalDate.now;
//import static java.time.Month.of;
public class CalculadorNoJubilado implements Calculador {
    //    private LogTransaction log;
//    private int mesEnPromocion;
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.15;
        } else {
            precioTotal += precioProducto * 0.21;
        }
        log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }
}
//interface Calculador {
//    double calcularPrecio(double precioProducto);
//}*/
