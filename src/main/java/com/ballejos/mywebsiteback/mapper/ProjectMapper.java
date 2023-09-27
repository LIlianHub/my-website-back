package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetProject;
import com.ballejos.mywebsiteback.model.ProjectModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProjectMapper {

    public AnswerGetProject toAnswerGetProject(ProjectModel projectModel){
        return new AnswerGetProject(
                projectModel.getIdStr(),
                projectModel.getImg(),
                projectModel.getTitre(),
                projectModel.getContenu());
    }

    public List<AnswerGetProject> toAnswerGetProjects(List<ProjectModel> projectModels){
        List<AnswerGetProject> answerGetProjects = new ArrayList<>();
        for (ProjectModel projectModel : projectModels) {
            answerGetProjects.add(toAnswerGetProject(projectModel));
        }
        return answerGetProjects;

    }


}
