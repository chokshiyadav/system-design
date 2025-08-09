// Strategy Interface
interface DriveStrategy {
    void drive();
}

// Concrete Strategies
class NormalDrive implements DriveStrategy {
    public void drive() {
        System.out.println("Normal driving mode");
    }
}

class OffRoadDrive implements DriveStrategy {
    public void drive() {
        System.out.println("Off-road driving mode");
    }
}

class SportsDrive implements DriveStrategy {
    public void drive() {
        System.out.println("Sports driving mode");
    }
}

// Context Class
class Vehicle {
    private DriveStrategy driveStrategy;

    // Constructor Injection
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}

// Vehicle Types
class Car extends Vehicle {
    Car() {
        super(new NormalDrive());
    }
}

class Truck extends Vehicle {
    Truck() {
        super(new OffRoadDrive());
    }
}

class SportsCar extends Vehicle {
    SportsCar() {
        super(new SportsDrive());
    }
}

public class AfterStrategy {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive(); // Normal driving mode

        Vehicle truck = new Truck();
        truck.drive(); // Off-road driving mode

        Vehicle sportsCar = new SportsCar();
        sportsCar.drive(); // Sports driving mode
    }
}
