package ar.edu.unrn.objetos2.ej4_jubilados;

public class LogTransactionFake implements LogTransaction {
    private String mensaje;

    @Override
    public void log(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}
