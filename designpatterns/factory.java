// Product interface
interface Vehicle {
    void drive();
}

// Concrete Products
class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a bike");
    }
}

class Truck implements Vehicle {
    public void drive() {
        System.out.println("Driving a truck");
    }
}

// Factory class
class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        return null;
    }
}

// Test class
public class FactoryPatternExample {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("car");
        vehicle1.drive();

        Vehicle vehicle2 = VehicleFactory.getVehicle("bike");
        vehicle2.drive();

        Vehicle vehicle3 = VehicleFactory.getVehicle("truck");
        vehicle3.drive();
    }
}
