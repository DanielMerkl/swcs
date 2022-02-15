package swcs.clean.bikestore.before;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BikeStore {

    private final List<Bike> bikes = new ArrayList<>();

    public boolean addBike(Bike bike) {
        return this.bikes.add(bike);
    }

    public List<Bike> findBikes(Predicate<Bike> filter) {
        return bikes.stream()
                .filter(filter)
                .toList();
    }

}
