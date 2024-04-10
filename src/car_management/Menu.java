/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_management;

/**
 *
 * @author tanth
 */
import java.util.Scanner;

class Menu {
    private Scanner scanner;
    private VehicleManagement vehicleManagement;

    public Menu() {
        scanner = new Scanner(System.in);
        vehicleManagement = new VehicleManagement();
    }

    public void run() {
        int choice = -1;
        while (choice != 0) {
            displayMainMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    removeVehicle();
                    break;
                case 3:
                    showAllVehicles();
                    break;
                case 4:
                    saveDataToFile();
                    break;
                case 5:
                    loadDataFromFile();
                    break;
                case 0:
                    System.out.println("Thoát...");
                    break;
                default:
                    System.out.println("Lua chon sai.");
            }
            System.out.println();
        }
    }

    private void displayMainMenu() {
        System.out.println("----- HE THONG QUAN LY XE-----");
        System.out.println("1.Them xe");
        System.out.println("2. Xoa");
        System.out.println("3. Danh sach xe");
        System.out.println("4. Luu du lieu vao xe");
        System.out.println("5. Load tap tin");
        System.out.println("0. Thoat");
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private void addVehicle() {
        scanner.nextLine(); // Consume the newline character

        System.out.print("Nhap loai xe (car, motorcycle, truck): ");
        String type = scanner.nextLine();
        System.out.print("Nhap Id xe: ");
        String id = scanner.nextLine();
        System.out.print("Nhap hang xe: ");
        String brand = scanner.nextLine();
        System.out.print("Nhap nam san xuat: ");
        int publishYear = scanner.nextInt();
        System.out.print("Nhap gia cua xe: ");
        double price = scanner.nextDouble();
        System.out.print("Enter vehicle color: ");
        String color = scanner.next();

        if (type.equalsIgnoreCase("car")) {
            System.out.print("Nhap so cho ngoi: ");
            int slots = scanner.nextInt();
            System.out.print("Nhap kieu dong co: ");
            String engineType = scanner.next();
            Car car = new Car(id, brand, publishYear, price, color, slots, engineType);
            vehicleManagement.addVehicle(car);
        } else if (type.equalsIgnoreCase("motorcycle")) {
            System.out.print("Nhap cong suat: ");
            int capacity = scanner.nextInt();
            Motorcycle motorcycle = new Motorcycle(id, brand, publishYear, price, color, capacity);
            vehicleManagement.addVehicle(motorcycle);
        } else if (type.equalsIgnoreCase("truck")) {
            System.out.print("Nhap kha nang tai trong: ");
            double loadWeight = scanner.nextDouble();
            Truck truck = new Truck(id, brand, publishYear, price, color, loadWeight);
            vehicleManagement.addVehicle(truck);
        } else {
            System.out.println("Loai xe khong hop le.");
        }
    }

    private void removeVehicle() {
        scanner.nextLine(); // Consume the newline character

        System.out.print("Nhap Id xe de loai bo: ");
        String removeId = scanner.nextLine();
        vehicleManagement.removeVehicle(removeId);
    }

    private void showAllVehicles() {
        vehicleManagement.showAllVehicles();
    }

    private void saveDataToFile() {
        scanner.nextLine(); // Consume the newline character

        System.out.print("Nhap ten file de luu: ");
        String saveFilename = scanner.nextLine();
        vehicleManagement.saveToFile(saveFilename);
    }

    private void loadDataFromFile() {
        scanner.nextLine(); // Consume the newline character

        System.out.print("Nhap ten file de load du lieu: ");
        String loadFilename = scanner.nextLine();
        vehicleManagement.loadFromFile(loadFilename);
    }
}
