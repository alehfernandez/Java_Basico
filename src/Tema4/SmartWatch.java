package Tema4;

public class SmartWatch extends SmartDevice {

    private String material;
    private boolean resistenteAgua;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, double precio, String material, boolean resistenteAgua) {
        super(marca, modelo, precio);
        this.material = material;
        this.resistenteAgua = resistenteAgua;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isResistenteAgua() {
        return resistenteAgua;
    }

    public void setResistenteAgua(boolean resistenteAgua) {
        this.resistenteAgua = resistenteAgua;
    }

}
