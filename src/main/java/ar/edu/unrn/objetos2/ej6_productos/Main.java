package ar.edu.unrn.objetos2.ej6_productos;

public class Main {
    public static void main(String[] args) {

        var p1 = new ProductoLibro(30);
        var p2 = new ProductoMedicina(330);
        var p3 = new ProductoAlimento(130);
        var p4 = new ProductoOtro(130);

        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}