public class OAuthLogin implements ILogin{
    private String authentic;

    public OAuthLogin(String authentic){
        this.authentic = authentic;
    }

    @Override
    public boolean authenticate(String username, String password){
        if(password.equals(authentic)) return true;
        else return false;
    }
}
