package Task5;

public abstract class MailSender {
    public abstract String doBeforeSend(String line);
    public abstract String doAfterSend(String line);

    public void send(String message){
        message = doBeforeSend(message);
        System.out.println(message);
        message = doAfterSend(message);
    }

}
