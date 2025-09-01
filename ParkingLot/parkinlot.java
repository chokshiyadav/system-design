class ParkingLot {
    private static ParkingLot instance;
    private ParkingSpotManager manager = new ParkingSpotManager();

    private ParkingLot() {}

    public static ParkingLot getInstance() {
        if (instance == null) instance = new ParkingLot();
        return instance;
    }

    public ParkingSpotManager getManager() { return manager; }
}
