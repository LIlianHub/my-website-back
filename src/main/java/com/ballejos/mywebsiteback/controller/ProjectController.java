package com.ballejos.mywebsiteback.controller;

import com.ballejos.mywebsiteback.entity.AnswerGetProject;
import com.ballejos.mywebsiteback.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @GetMapping("/getProject/{id}")
    public AnswerGetProject getSpecificProject(@PathVariable("id") final String id) {
        return projectService.getProject(id);
    }

    @GetMapping("/getProject")
    public List<AnswerGetProject> getAllProject() {
        return projectService.getAllProject();
    }

}

