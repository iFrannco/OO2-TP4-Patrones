package ar.edu.unrn.objetos2.ej5_remeras;

public class Main {
    public static void main(String[] args) {
        var remeraNacional = new RemeraNacional(253);
        var resultado = remeraNacional.calcularPrecio();
        System.out.println(resultado);
    }
}
