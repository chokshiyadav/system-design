class EntranceGate {
    private ParkingSpotManager manager;
    public EntranceGate(ParkingSpotManager m) { this.manager = m; }

    public Ticket generateTicket(Vehicle v) {
        ParkingSpot spot = manager.findSpot(SpotType.valueOf(v.getType().name()));
        if (spot == null) return null;
        spot.parkVehicle(v);
        return new Ticket("T" + System.currentTimeMillis(), v, spot);
    }
}

class ExitGate {
    public double calculateCost(Ticket t, int hoursParked) {
        return hoursParked * t.getSpot().pricePerHour;
    }

    public void freeSpot(Ticket t) {
        t.getSpot().removeVehicle();
    }
}
