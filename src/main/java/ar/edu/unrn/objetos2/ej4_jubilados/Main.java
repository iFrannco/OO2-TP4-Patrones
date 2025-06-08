package ar.edu.unrn.objetos2.ej4_jubilados;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        var logTransaction = new LogTransactionConsola();
        var jubilado = new Jubilado(3, logTransaction);
        var resultado = jubilado.calcularPrecio(100, Month.of(3));

        System.out.println(resultado);
    }
}
