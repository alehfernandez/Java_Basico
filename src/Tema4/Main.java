package Tema4;

public class Main {

    public static void main(String[] args) {
        SmartPhone miSmartphone = new SmartPhone("Samsung", "Galaxy S20", 799.99, 128, 6);
        SmartWatch miSmartwatch = new SmartWatch("Apple", "Watch Series 6", 449.99, "Plastico", true);

        System.out.println("Mi smartphone es un " + miSmartphone.getMarca() + " modelo " + miSmartphone.getModelo() + " valor " + miSmartphone.getPrecio() + " almacenamiento " + miSmartphone.getAlmacenamiento() + " Memoria RAM " + miSmartphone.getRam());
        System.out.println("Mi smartWatch es un " + miSmartwatch.getMarca() + " modelo " + miSmartwatch.getModelo() + " valor " + miSmartwatch.getPrecio() + " Material " + miSmartwatch.getMaterial());

    }

}
