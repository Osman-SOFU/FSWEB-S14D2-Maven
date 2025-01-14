package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private Boolean battery;
    private int globRating;

    public Lamp(LampType style, Boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public Boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
