package com.ballejos.mywebsiteback.service;

import com.ballejos.mywebsiteback.entity.ReceivePostMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.ballejos.mywebsiteback.entity.AnswerPostMail;

@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public AnswerPostMail sendSimpleMail(ReceivePostMail details) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo("lilian.ballejos@hotmail.fr");
            mailMessage.setSubject(details.getSubject());
            mailMessage.setFrom(sender);
            mailMessage.setText("From: " + details.getUserEmail() + "\n" + details.getMsgBody());

            javaMailSender.send(mailMessage);
            return new AnswerPostMail("Mail sent successfuly");
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "SendMailError: Something went wrong please try later");
        }
    }
}

