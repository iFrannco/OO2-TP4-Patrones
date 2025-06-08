package ar.edu.unrn.objetos2.ej4_jubilados;

public class LogTransactionConsola implements LogTransaction {
    @Override
    public void log(String mensaje) {
        System.out.println(mensaje);
    }
}
