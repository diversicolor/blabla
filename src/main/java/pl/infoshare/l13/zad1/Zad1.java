package pl.infoshare.l13.zad1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Zad1 {

    public static void main (String[] args) throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName("kreadszik@gmail.com");
        email.setSmtpPort(25);
        email.setAuthenticator(new DefaultAuthenticator("kredaszik", ""));
        email.setSSLOnConnect(true);
        email.setFrom("test@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("Test email");
        email.addTo("");
        email.send();
    }
}
