/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_management;

/**
 *
 * @author tanth
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
class VehicleManagement {
    private List<Vehicle> vehicles;

    public VehicleManagement() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(String id) {
        Vehicle vehicle = findVehicleById(id);
        if (vehicle != null) {
            vehicles.remove(vehicle);
            System.out.println("loai bo xe.");
        } else {
            System.out.println("Xe khong duoc tim thay.");
        }
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
            System.out.println("-------------------------");
        }
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                return vehicle;
            }
        }
        return null;
    }

    public void saveToFile(String danhsachxe) {
        try (FileOutputStream fos = new FileOutputStream(danhsachxe);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(vehicles);
            System.out.println("du lieu da duoc luu.");
        } catch (IOException e) {
            System.out.println("Loi: " +e.getMessage());
        }
    }

    public void loadFromFile(String danhsachxe) {
        try (FileInputStream fis = new FileInputStream(danhsachxe);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            vehicles = (List<Vehicle>) ois.readObject();
            System.out.println("du lieu tai len tu tap tin.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
