package car_management;

class Car extends Vehicle {
    private int slots;
    private String engineType;

    public Car(String id, String brand, int publishYear, double price, String color, int slots, String engineType) {
        super(id, brand, publishYear, price, color);
        this.slots = slots;
        this.engineType = engineType;
    }

    public int getSlots() {
        return slots;
    }

    public String getEngineType() {
        return engineType;
    }

    
    public void showInfo() {
        super.showInfo();
        System.out.println("So cho ngoi: " + slots);
        System.out.println("Kieu dong co: " + engineType);
    }
}
