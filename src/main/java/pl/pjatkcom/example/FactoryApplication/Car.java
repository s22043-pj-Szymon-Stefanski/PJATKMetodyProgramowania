package pl.pjatkcom.example.FactoryApplication;

public class Car {
    private String brand;
    private String model;
    private int wheels;
    private int gears;

    public Car() {
    }

    public Car(String brand, String model, int wheels, int gears) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.gears = gears;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
