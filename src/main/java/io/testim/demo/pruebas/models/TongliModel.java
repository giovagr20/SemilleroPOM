package io.testim.demo.pruebas.models;

public class TongliModel {

    private String numberAdults;
    private String numberChildren;
    private String typeWorld;
    private String colorWorld;

    public TongliModel() {
    }

    public TongliModel(String numberAdults, String numberChildren, String typeWorld, String colorWorld) {
        this.numberAdults = numberAdults;
        this.numberChildren = numberChildren;
        this.typeWorld = typeWorld;
        this.colorWorld = colorWorld;
    }

    public String getNumberAdults() {
        return numberAdults;
    }

    public void setNumberAdults(String numberAdults) {
        this.numberAdults = numberAdults;
    }

    public String getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(String numberChildren) {
        this.numberChildren = numberChildren;
    }

    public String getTypeWorld() {
        return typeWorld;
    }

    public void setTypeWorld(String typeWorld) {
        this.typeWorld = typeWorld;
    }

    public String getColorWorld() {
        return colorWorld;
    }

    public void setColorWorld(String colorWorld) {
        this.colorWorld = colorWorld;
    }
}
