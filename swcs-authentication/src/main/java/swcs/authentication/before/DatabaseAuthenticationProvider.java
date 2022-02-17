package swcs.authentication.before;

public class DatabaseAuthenticationProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(Identifiable identifiable) {
        // logic
        return true;
    }
}
