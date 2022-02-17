package swcs.rental.before;

public class Tester {

    public static void main(String[] args) {
        Customer customer = new Customer("Bad Coder");
        customer.addRental(new Rental(new Movie("Clean Code", Movie.Type.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Java", Movie.Type.CHILDREN), 1));

        customer.statement();
    }
}
