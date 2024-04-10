/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_management;

/**
 *
 * @author tanth
 */
class Motorcycle extends Vehicle {
    private int capacity;

    public Motorcycle(String id, String brand, int publishYear, double price, String color, int capacity) {
        super(id, brand, publishYear, price, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cong suat: " + capacity);
    }
}

