package swcs.rental.before;

record Rental(Movie movie, int daysRented) {
    public double price() {
        return daysRented * movie.type().priceMultiplier;
    }
}
