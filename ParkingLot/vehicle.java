enum VehicleType { CAR, BIKE, TRUCK, EV }

class Vehicle {
    private String vehicleNo;
    private VehicleType type;
    public Vehicle(String no, VehicleType type) {
        this.vehicleNo = no; this.type = type;
    }
    public VehicleType getType() { return type; }
}
