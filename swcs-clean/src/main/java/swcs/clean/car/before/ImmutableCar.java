package swcs.clean.car.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public record ImmutableCar(
        String name,
        LocalDate manufactured,
        List<String> previousOwners
) {

    public ImmutableCar(String name, LocalDate manufactured, List<String> previousOwners) {
        this.name = name;
        this.manufactured = manufactured;
        this.previousOwners = List.copyOf(previousOwners);
    }

    public ImmutableCar(String name, LocalDate manufactured) {
        this(name, manufactured, new ArrayList<>());
    }

    public ImmutableCar addPreviousOwner(String name) {
        List<String> updatedOwners = new ArrayList<>(previousOwners);
        updatedOwners.add(name.trim());
        return new ImmutableCar(this.name, this.manufactured, updatedOwners);
    }

}
