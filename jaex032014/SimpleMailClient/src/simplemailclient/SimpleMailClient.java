package simplemailclient; 
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 
public class SimpleMailClient {
    public static void main(String[] args) throws AddressException, MessagingException {
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.port", "465");
        Session session = Session.getInstance(props, new Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication(){
                   return new PasswordAuthentication("myemail@google.com", "mypassword");
               }
        });
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("myemail@google.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("targetemail@targethost.com"));
        message.setSubject("Test Java Mail");
        message.setText("Hello from Java!");
        Transport.send(message); 
    }
}
