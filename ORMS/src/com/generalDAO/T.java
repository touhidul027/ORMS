package com.generalDAO;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  

public class T {
	public static boolean sentMail() throws AddressException, MessagingException {
		
		try {
	      String host="smtp.gmail.com" ; 
	      String user="15103199@iubat.edu" ; 
	      String password="o7JqO95y" ; 
		  String  to = "academicstudy0001cplus@gmail.com";//change accordingly  
	      String  from = "15103199@iubat.edu";//change accordingly 
	      String subject="test" ; 
		  String text = "this is body" ; 
	      boolean sessionDebug=false ; 
	      
	      Properties props = System.getProperties() ; 
	      props.put("mail.smtp.starttls.enable", "true") ; 
		  props.put("mail.smtp.host", host) ; 
		  props.put("mail.smtp.port", "587") ; 
		  props.put("mail.smtp.auth", "true") ; 
	      props.put("mail.smtp.starttls.required", "true") ; 

	      java.security.Security.addProvider( new com.sun.net.ssl.internal.ssl.Provider()) ; 
	      Session mailSession = Session.getDefaultInstance(props,null) ; 
	      mailSession.setDebug(sessionDebug);
	      
	     Message msg = new MimeMessage(mailSession) ; 
	     msg.setFrom( new InternetAddress(from));
	     InternetAddress[] address = {new InternetAddress(to)} ; 
	     msg.setRecipients(Message.RecipientType.TO, address); 
	     msg.setSubject(subject);
	     msg.setSentDate(new Date());
	     msg.setText(text);
	     
	     Transport transport = mailSession.getTransport("smtp") ; 
	     transport.connect(host, user, password);
	     transport.sendMessage(msg, msg.getAllRecipients());
	     transport.close();
	     System.out.println("Success");
		}catch(Exception e) {
			System.out.println(e);
		}
	     
	     return false;		      
	}
	
}
