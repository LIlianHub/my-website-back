
package com.ballejos.mywebsiteback.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.ballejos.mywebsiteback.entity.AnswerGetProject;

import java.util.List;
import java.util.ArrayList;

@RestController
public class ProjectController {

    @GetMapping("/getProject/{id}")
    public AnswerGetProject getSpecificProject(@PathVariable("id") final String id){
        return new AnswerGetProject();
    }

    @GetMapping("/getProject")
    public List<AnswerGetProject> getAllProject(){
        return new ArrayList<AnswerGetProject>();
    }

}

