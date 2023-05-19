package HWClass21;

abstract public class Computer {
    protected String brand;
    protected String model;
    protected int price;
    public Computer(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void turnOn() {
        System.out.println("Turning on " + brand + " " + model);
    }
    public void turnOff() {
        System.out.println("Turning off " + brand + " " + model);
    }
    public abstract void printSpecs();
}
class Apple extends Computer {
    public Apple(String model, int price) {
        super("Apple", model, price);
    }
    @Override
    public void printSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Operating System: macOS");
    }
    public void runXcode() {
        System.out.println("Running Xcode on " + brand + " " + model);
    }
}
class Lenovo extends Computer {
    public Lenovo(String model, int price) {
        super("Lenovo", model, price);
    }
    @Override
    public void printSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Operating System: Windows");
    }
}
class HP extends Computer {
    public HP(String model, int price) {
        super("HP", model, price);
    }
    @Override
    public void printSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Operating System: Windows");
    }
}
class Dell extends Computer {
    public Dell(String model, int price) {
        super("Dell", model, price);
    }
    @Override
    public void printSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Operating System: Windows");
    }
}
