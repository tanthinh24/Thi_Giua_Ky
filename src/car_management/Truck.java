/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_management;

/**
 *
 * @author tanth
 */
class Truck extends Vehicle {
    private double loadWeight;

    public Truck(String id, String brand, int publishYear, double price, String color, double loadWeight) {
        super(id, brand, publishYear, price, color);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Tai trong toi da: " + loadWeight);
    }
}