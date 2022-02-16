package swcs.authentication.before;

public class AuthenticationManager {

    private final DatabaseAuthenticationProvider provider;

    public AuthenticationManager(DatabaseAuthenticationProvider provider) {
        this.provider = provider;
    }

    public void login(Identifiable identifiable) {
        this.provider.authenticate(identifiable);
    }
}
