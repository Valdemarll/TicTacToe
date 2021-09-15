package Task5;

public class Sender1 extends MailSender{

    @Override
    public String doBeforeSend(String line) {
        return "Привет! " + line;
    }

    @Override
    public String doAfterSend(String line) {
        return "";
    }
}
