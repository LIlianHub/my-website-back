package com.ballejos.mywebsiteback.controller;

import com.ballejos.mywebsiteback.entity.ReceivePostMail;
import com.ballejos.mywebsiteback.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody ReceivePostMail receivedRequest) {
        return mailService.sendSimpleMail(receivedRequest);
    }


}

