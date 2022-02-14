package swcs.clean.bikestore.before;

import java.util.ArrayList;
import java.util.List;

public class BikeStore {

    List<Bike> bikes = new ArrayList<>();

    public boolean addBike(Bike bike) {
        return this.bikes.add(bike);
    }

    public List<Bike> findBikes(Bike.Type type) {
        return bikes.stream()
                .filter(bike -> bike.type() == type)
                .toList();
    }

    public List<Bike> findBikes(float lowerLimit, float upperLimit) {
        return bikes.stream()
                .filter(bike -> bike.price() >= lowerLimit)
                .filter(bike -> bike.price() <= upperLimit)
                .toList();
    }

    public List<Bike> findBikes(float lowerLimit, float upperLimit, Bike.Type type) {
        return bikes.stream()
                .filter(bike -> bike.type() == type)
                .filter(bike -> bike.price() >= lowerLimit)
                .filter(bike -> bike.price() <= upperLimit)
                .toList();
    }

}
