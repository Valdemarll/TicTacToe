package Task5;

public class Sender2 extends MailSender{
    @Override
    public String doBeforeSend(String line) {
        return line + "!!!";
    }

    @Override
    public String doAfterSend(String line) {
        return null;
    }

}
