package swcs.clean.bikestore.before;

public class Bike {

    public enum Type {
        MTB,
        ROAD,
        CITY,
    }

    private final Type type;
    private final float price;
    private final String manufacturer;

    public Bike(String manufacturer, Type type, float price) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.price = price;
    }

    public String manufacturer() {
        return this.manufacturer;
    }

    public Type type() {
        return this.type;
    }

    public float price() {
        return this.price;
    }

    public boolean isFullSuspension() {
        return switch (this.type) {
            case MTB -> true;
            case ROAD, CITY -> false;
        };
    }
}
