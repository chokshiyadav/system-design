enum SpotType { CAR, BIKE, TRUCK, EV }

class ParkingSpot {
    private String spotId;
    private SpotType type;
    private boolean isEmpty = true;
    private Vehicle vehicle;
    private double pricePerHour;

    public ParkingSpot(String id, SpotType type, double price) {
        this.spotId = id; this.type = type; this.pricePerHour = price;
    }

    public boolean parkVehicle(Vehicle v) {
        if (!isEmpty) return false;
        this.vehicle = v; this.isEmpty = false; return true;
    }

    public void removeVehicle() {
        this.vehicle = null; this.isEmpty = true;
    }

    public boolean isEmpty() { return isEmpty; }
    public SpotType getType() { return type; }
}
