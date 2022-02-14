package swcs.clean.car.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ImmutableCar {

    private final String name;
    private final LocalDate manufactured;
    private final List<String> previousOwners = new ArrayList<>();

    public ImmutableCar(String name, LocalDate manufactured) {
        this.name = name;
        this.manufactured = manufactured;
    }

    public LocalDate manufactured() {
        return this.manufactured;
    }

    public String name() {
        return this.name;
    }

    public List<String> previousOwners() {
        return List.copyOf(this.previousOwners);
    }

    public boolean addPreviousOwner(String name) {
        return this.previousOwners.add(name.trim());
    }
}
