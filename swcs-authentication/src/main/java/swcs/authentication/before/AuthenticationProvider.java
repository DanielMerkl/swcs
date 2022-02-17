package swcs.authentication.before;

public interface AuthenticationProvider {
    boolean authenticate(Identifiable identifiable);
}
