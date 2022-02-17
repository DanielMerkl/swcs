package swcs.rental.before;

import java.util.ArrayList;
import java.util.List;

final class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    private double totalAmount() {
        return rentals.stream()
                .mapToDouble(Rental::price)
                .sum();
    }

    public void statement() {
        System.out.println("Rental Record for " + name());

        rentals.stream()
                .map(rental -> "\t%s\t%s".formatted(rental.movie().title(), rental.price()))
                .forEach(System.out::println);

        System.out.println("Amount owed is " + this.totalAmount());
    }
}
