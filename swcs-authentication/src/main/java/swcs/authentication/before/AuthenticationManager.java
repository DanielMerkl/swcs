package swcs.authentication.before;

public class AuthenticationManager {

    private final AuthenticationProvider provider;

    public AuthenticationManager(AuthenticationProvider provider) {
        this.provider = provider;
    }

    public void login(Identifiable identifiable) {
        this.provider.authenticate(identifiable);
    }
}
