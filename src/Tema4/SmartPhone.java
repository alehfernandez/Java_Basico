package Tema4;

public class SmartPhone extends SmartDevice {

    private int almacenamiento;
    private int ram;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String marca, String modelo, double precio, int almacenamiento, int ram) {
        super(marca, modelo, precio);
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
