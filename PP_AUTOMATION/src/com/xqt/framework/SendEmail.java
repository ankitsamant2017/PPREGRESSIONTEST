package com.xqt.framework;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
  
public class SendEmail{  
 public  void SendReportVIAemail(){  
  
  String to="ankit.samant@xentaqsys.com";//change accordingly  
  final String user="ankit.samant@xentaqsys.com";//change accordingly  
  final String password="Z!mb@5#82";//change accordingly  
   
  //1) get the session object     
  Properties properties = System.getProperties();  
  
  properties.setProperty("mail.smtp.host", "pop.webhost4life.com");  
  properties.put("mail.smtp.auth", "true");  
  
  Session session = Session.getDefaultInstance(properties,  
   new javax.mail.Authenticator() {  
   protected PasswordAuthentication getPasswordAuthentication() {  
   return new PasswordAuthentication(user,password);  
   }  
  });  
     
  //2) compose message     
  try{  
    MimeMessage message = new MimeMessage(session);  
    message.setFrom(new InternetAddress(user));  
    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
    message.setSubject("PAINT PARTNER:WEB DEPLOYMENT TESTING REPORT");  
      
    //3) create MimeBodyPart object and set your message text     
    BodyPart messageBodyPart1 = new MimeBodyPart();  
    messageBodyPart1.setText("Dear Sir,Please Find attached  Pre and Post Deployment testing Report and verify the same!!!");  
      
    //4) create new MimeBodyPart object and set DataHandler object to this object       
    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
  
  
    String filename = "tests/testscenarios.xlsx";//change accordingly  
    DataSource source = new FileDataSource(filename);  
    messageBodyPart2.setDataHandler(new DataHandler(source));  
    messageBodyPart2.setFileName(filename);  
     
     
    //5) create Multipart object and add MimeBodyPart objects to this object      
    Multipart multipart = new MimeMultipart();  
    multipart.addBodyPart(messageBodyPart1);  
    multipart.addBodyPart(messageBodyPart2);  
  
    //6) set the multiplart object to the message object  
    message.setContent(multipart );  
     
    //7) send message  
    Transport.send(message);  
   
   System.out.println("message sent....");  
   }catch (MessagingException ex) {ex.printStackTrace();}  
 }  
}  