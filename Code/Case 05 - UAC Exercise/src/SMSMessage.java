public class SMSMessage extends Message{

    public SMSMessage(ILogin login, String emailFrom, String emailTo, String message){
        super(login, emailFrom, emailTo, message);
    }

    @Override
    public void send(String username, String password){
        if(getILogin().authenticate(username, password)){
            System.out.println("Email sent from " + getSender() + " to " + getRecipient() + ": " + getContent());
        }
        else{
            System.out.println("Email authentication failed for user: " + username);
        }
    }
}
