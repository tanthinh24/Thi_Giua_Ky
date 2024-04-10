



package car_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<ICar> cars;

    public CarManager() {
        this.cars = new ArrayList<>();
    }

    // Create a new car
    public void createCar(ICar car) {
        cars.add(car);
    }

    // Read all cars
    public void readAllCars() {
        for (ICar car : cars) {
            car.showInfo();
        }
    }

    // Update car
    public void updateCar(int index, ICar car) {
        cars.set(index, car);
    }

    // Delete car
    public void deleteCar(int index) {
        cars.remove(index);
    }

    // Write cars to file
    public void writeToFile(String danhsachxe) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(danhsachxe))) {
            oos.writeObject(cars);
            System.out.println("Xong.");
        } catch (IOException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    // Read cars from file
    @SuppressWarnings("unchecked")
    public void readFromFile(String danhsachxe) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(danhsachxe))) {
            cars = (List<ICar>) ois.readObject();
            System.out.println("Xong.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
