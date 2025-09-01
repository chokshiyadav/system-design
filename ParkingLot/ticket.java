import java.time.LocalDateTime;

class Ticket {
    private String id;
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot spot;

    public Ticket(String id, Vehicle v, ParkingSpot s) {
        this.id = id; this.vehicle = v; this.spot = s;
        this.entryTime = LocalDateTime.now();
    }

    public LocalDateTime getEntryTime() { return entryTime; }
    public ParkingSpot getSpot() { return spot; }
}
