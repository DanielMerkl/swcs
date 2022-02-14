package swcs.clean.bikestore.before;

import java.util.ArrayList;
import java.util.List;

public class BikeStore {

    List<Bike> bikes = new ArrayList<>();

    public boolean addBike(Bike bike) {
        return this.bikes.add(bike);
    }

    public List<Bike> findBikes(Bike.Type type) {
        List<Bike> founds = new ArrayList<>();

        for (int i = 0; i < bikes.size(); i++) {
            if (bikes.get(i).type() == type) {
                founds.add(bikes.get(i));
            }
        }

        return founds;
    }

    public List<Bike> findBikes(float lowerLimit, float upperLimit) {
        List<Bike> founds = new ArrayList<>();

        for (int i = 0; i < bikes.size(); i++) {
            if (bikes.get(i).price() >= lowerLimit && bikes.get(i).price() <= upperLimit) {
                founds.add(bikes.get(i));
            }
        }

        return founds;
    }

    public List<Bike> findBikes(float lowerLimit, float upperLimit, Bike.Type type) {
        List<Bike> founds = new ArrayList<>();

        for (int i = 0; i < bikes.size(); i++) {
            if ((bikes.get(i).price() >= lowerLimit && bikes.get(i).price() <= upperLimit) && bikes.get(i).type() == type) {
                founds.add(bikes.get(i));
            }
        }

        return founds;
    }

}
