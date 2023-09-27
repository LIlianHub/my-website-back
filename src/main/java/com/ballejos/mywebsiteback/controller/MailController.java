package com.ballejos.mywebsiteback.controller;

import com.ballejos.mywebsiteback.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ballejos.mywebsiteback.entity.ReceiveRequestMail;


@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody ReceiveRequestMail receivedRequest){
        return mailService.sendSimpleMail(receivedRequest);
    }


}

