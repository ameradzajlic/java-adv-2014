package imapmailclient;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store; 
public class ImapMailClient {
    public static void main(String[] args) throws MessagingException, IOException {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        Session session = Session.getInstance(props);
        Store store = session.getStore(); 
        store.connect("imap.gmail.com", "mygmailaddress@gmail.com", "mygmailpassword"); 
        Folder inbox = store.getFolder("INBOX"); 
        inbox.open(Folder.READ_ONLY);
        int lastmsg = inbox.getMessageCount();
        while(lastmsg>0){
            Message msg = inbox.getMessage(lastmsg--);
            System.out.println("From: " + msg.getFrom()[0]);
            System.out.println("Subject: " + msg.getSubject());
            System.out.println("Body: " + msg.getContent());
        } 
    }
}
