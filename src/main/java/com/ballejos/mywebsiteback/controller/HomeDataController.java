package com.ballejos.mywebsiteback.controller;

import com.ballejos.mywebsiteback.entity.AnswerGetHomeData;
import com.ballejos.mywebsiteback.service.HomeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HomeDataController {

    @Autowired
    private HomeDataService homeDataService;

    @GetMapping("/getHomeData")
    public List<AnswerGetHomeData> getHomeData() {
        return homeDataService.getAllHomeData();
    }


}

