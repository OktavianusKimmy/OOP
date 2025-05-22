public class OAuthLogin implements ILogin{
    private String token;

    public OAuthLogin(String token){
        this.token = token;
    }

    @Override
    public boolean authenticate(String username, String password){
        if(password.equals(token)) return true;
        else return false;
    }
}
