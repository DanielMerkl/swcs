package swcs.clean.car.before;

import java.util.ArrayList;
import java.util.Date;

public class ImmutableCar {

    private String name;
    private Date manufactured;
    private ArrayList previousOwners = new ArrayList();

    public ImmutableCar(String name, Date manufactured) {
        this.name = name;
        this.manufactured = manufactured;
    }

    public Date manufactured() {
        return this.manufactured;
    }

    public String vin() {
        return this.name;
    }

    public ArrayList previousOwners() {
        return this.previousOwners;
    }

    public boolean addPreviousOwner(String text) {
        text.trim();
        return this.previousOwners.add(text);
    }
}
