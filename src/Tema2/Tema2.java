package Tema2;

public class Tema2 {

    public static void main(String[] args) {
        double precio = 300;
        double precioConIVA = calcularPrecioConIVA(precio);
        System.out.println("Precio con IVA: " + precioConIVA);
    }

    public static double calcularPrecioConIVA(double precio) {
        double iva = 0.21;
        double precioConIVA = precio * (1 + iva);
        return precioConIVA;
    }
}
