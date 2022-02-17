package swcs.rental.before;

public record Movie(String title, Type type) {

    enum Type {
        CHILDREN(2, 1),
        REGULAR(0, 2),
        NEW_RELEASE(1, 3),
        ;

        final int id;
        final int priceMultiplier;

        Type(int id, int priceMultiplier) {
            this.id = id;
            this.priceMultiplier = priceMultiplier;
        }
    }

}
