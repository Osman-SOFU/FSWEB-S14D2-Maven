package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // Duvarları ve tavanı oluşturuyoruz
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(300, PaintColor.WHITE);

        // Bedroom için diğer nesneleri oluşturuyoruz
        Bed bed = new Bed("Modern", 2, 45, 2, 1);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 75);
        Wardrobe wardrobe = new Wardrobe(100, 200, 70.0);
        Carpet carpet = new Carpet(150, 200, PaintColor.RED);

        // Bedroom nesnesini oluşturuyoruz
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Room sınıfının metotları
        System.out.println("Room Name: " + bedroom.getName());
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());

        // Bedroom sınıfının metotları
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}