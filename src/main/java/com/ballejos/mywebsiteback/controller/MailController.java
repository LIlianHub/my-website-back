package com.ballejos.mywebsiteback.controller;

import com.ballejos.mywebsiteback.entity.EmailDetails;
import com.ballejos.mywebsiteback.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/test")
    public String createPost(){
        boolean result = mailService.sendSimpleMail(
                new EmailDetails(
                "lilian.ballejos@hotmail.fr",
                "TEST",
                "SUUUUUH")
        );
        System.out.println(result);
        return "coucou";
    }


}

