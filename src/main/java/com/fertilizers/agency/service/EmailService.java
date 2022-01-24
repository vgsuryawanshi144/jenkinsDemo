package com.fertilizers.agency.service;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
    private JavaMailSender emailSender;

    public void sendMail(String toEmail, String subject, String message) {

    	SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);

        mailMessage.setFrom("Add your mail address");

        emailSender.send(mailMessage);
    }
    
    private void sendmail() throws AddressException, MessagingException, IOException {
    	   Properties props = new Properties();
    	   props.put("mail.smtp.auth", "true");
    	   props.put("mail.smtp.starttls.enable", "true");
    	   props.put("mail.smtp.host", "smtp.gmail.com");
    	   props.put("mail.smtp.port", "587");
    	   
    	   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
    	      protected PasswordAuthentication getPasswordAuthentication() {
    	         return new PasswordAuthentication("tutorialspoint@gmail.com", "<your password>");
    	      }
    	   });
    	   Message msg = new MimeMessage(session);
    	   msg.setFrom(new InternetAddress("tutorialspoint@gmail.com", false));

    	   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("tutorialspoint@gmail.com"));
    	   msg.setSubject("Tutorials point email");
    	   msg.setContent("Tutorials point email", "text/html");
    	   msg.setSentDate(new Date());

    	   MimeBodyPart messageBodyPart = new MimeBodyPart();
    	   messageBodyPart.setContent("Tutorials point email", "text/html");

    	   Multipart multipart = new MimeMultipart();
    	   multipart.addBodyPart(messageBodyPart);
    	   MimeBodyPart attachPart = new MimeBodyPart();

    	   attachPart.attachFile("/var/tmp/image19.png");
    	   multipart.addBodyPart(attachPart);
    	   msg.setContent(multipart);
    	   Transport.send(msg);   
    	}
}