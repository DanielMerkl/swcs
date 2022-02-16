package swcs.authentication.before;

public class AuthenticationManager {

    private final DatabaseAuthenticationProvider provider;

    public AuthenticationManager(DatabaseAuthenticationProvider provider) {
        this.provider = provider;
    }

    public void login(User user) {
        this.provider.authenticate(user);
    }
}
