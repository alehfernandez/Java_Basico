package Tema3;

public class Tema3 {

    public static void main(String[] args) {
        String[] textos = {"Texto1", " ", "Continuaciontexto1", "!"};
        String resultado = "";

        for (int i = 0; i < textos.length; i++) {
            resultado += textos[i];
        }

        System.out.println("El resultado es: " + resultado);
    }
}
