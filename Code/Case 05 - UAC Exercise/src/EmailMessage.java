public class EmailMessage extends Message{
    public EmailMessage(ILogin login, String sender, String recipient, String content){
        super(login, sender, recipient, content);
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
