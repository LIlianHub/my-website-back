package com.ballejos.mywebsiteback.service;

import com.ballejos.mywebsiteback.entity.AnswerGetProject;
import com.ballejos.mywebsiteback.mapper.ProjectMapper;
import com.ballejos.mywebsiteback.repository.ProjectRepo;
import com.ballejos.mywebsiteback.utils.RepositoryUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProjectService {


    private final ProjectMapper projectMapper;
    private final ProjectRepo projectRepo;

    public List<AnswerGetProject> getAllProject() {
        return projectMapper.toAnswerGetProjects(
                RepositoryUtils.checkIfNotEmpty(projectRepo.findAll(),
                        new ResponseStatusException(
                                HttpStatus.INTERNAL_SERVER_ERROR,
                                "ProjectError: Something went wrong please try later")
                )
        );
    }

    public AnswerGetProject getProject(String id_str) {
        return projectMapper.toAnswerGetProject(
                projectRepo.findByIdStr(id_str).orElseThrow(
                        () -> new ResponseStatusException(
                                HttpStatus.INTERNAL_SERVER_ERROR,
                                "ProjectError: Something went wrong please try later")
                )
        );
    }

}

