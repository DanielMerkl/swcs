package swcs.rental.before;

import java.util.ArrayList;
import java.util.List;

final class Customer {
    private final List<Rental> rentals = new ArrayList<>();
    private final String name;


    public void addRental(Rental arg) {
        this.rentals.add(arg);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public void statement() {
        double totalAmount = 0;

        String result = "Rental Record for " + name() + "\n";
        for (Rental rental : rentals) {
            double thisAmount = 0;

            // determine amounts for each line
            switch (rental.movie()
                    .priceCode()) {
                case Movie.CHILDREN:
                    thisAmount += rental.daysRented();

                    break;
                case Movie.REGULAR:
                    thisAmount += rental.daysRented() * 2;

                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += rental.daysRented() * 3;
                    break;

            }
            // show figures for this rental
            result += "\t" + rental.movie().title() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";

        System.out.println(result);
    }
}
