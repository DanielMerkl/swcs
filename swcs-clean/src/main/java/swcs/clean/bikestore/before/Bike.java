package swcs.clean.bikestore.before;

public record Bike(
        String manufacturer,
        Bike.Type type,
        float price
) {

    public enum Type {
        MTB(0, true),
        ROAD(1, false),
        CITY(2, false);

        private final int id;
        private final boolean isFullSuspension;

        Type(int id, boolean isFullSuspension) {
            this.id = id;
            this.isFullSuspension = isFullSuspension;
        }

        public int getId() {
            return id;
        }

        public boolean isFullSuspension() {
            return isFullSuspension;
        }
    }

    public boolean isFullSuspension() {
        return type.isFullSuspension;
    }
}
