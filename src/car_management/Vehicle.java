/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_management;

/**
 *
 * @author tanth
 */
class Vehicle implements ICar {
    private String id;
    private String brand;
    private int publishYear;
    private double price;
    private String color;

    public Vehicle(String id, String brand, int publishYear, double price, String color) {
        this.id = id;
        this.brand = brand;
        this.publishYear = publishYear;
        this.price = price;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Hang: " + brand);
        System.out.println("Nam san xuat: " + publishYear);
        System.out.println("Gia: " + price);
        System.out.println("Mau sac: " + color);
    }
}
