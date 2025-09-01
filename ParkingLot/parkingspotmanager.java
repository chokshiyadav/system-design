import java.util.*;

class ParkingSpotManager {
    private List<ParkingSpot> spots = new ArrayList<>();

    public void addSpot(ParkingSpot spot) { spots.add(spot); }

    public ParkingSpot findSpot(SpotType type) {
        for (ParkingSpot s : spots) {
            if (s.isEmpty() && s.getType() == type) return s;
        }
        return null;
    }
}
