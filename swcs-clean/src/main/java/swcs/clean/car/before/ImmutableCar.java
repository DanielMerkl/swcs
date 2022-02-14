package swcs.clean.car.before;

import java.time.LocalDate;
import java.util.ArrayList;

public class ImmutableCar {

    private final String name;
    private final LocalDate manufactured;
    private final ArrayList<String> previousOwners = new ArrayList<>();

    public ImmutableCar(String name, LocalDate manufactured) {
        this.name = name;
        this.manufactured = manufactured;
    }

    public LocalDate manufactured() {
        return this.manufactured;
    }

    public String vin() {
        return this.name;
    }

    public ArrayList<String> previousOwners() {
        return this.previousOwners;
    }

    public boolean addPreviousOwner(String text) {
        text.trim();
        return this.previousOwners.add(text);
    }
}
