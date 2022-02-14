package swcs.clean.bikestore.before;

public record Bike(
        String manufacturer,
        Bike.Type type,
        float price
) {

    public enum Type {
        MTB,
        ROAD,
        CITY,
    }

    public boolean isFullSuspension() {
        return type == Type.MTB;
    }
}
