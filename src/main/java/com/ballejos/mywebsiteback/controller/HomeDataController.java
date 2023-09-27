package com.ballejos.mywebsiteback.controller;

import com.ballejos.mywebsiteback.entity.AnswerGetHomeData;
import com.ballejos.mywebsiteback.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class HomeDataController {


    @GetMapping("/getHomeData")
    public List<AnswerGetHomeData> getHomeData(){
        return new ArrayList<AnswerGetHomeData>();
    }


}

