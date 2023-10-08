package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetProject;
import com.ballejos.mywebsiteback.model.ProjectModel;
import com.ballejos.mywebsiteback.service.MarkdownParserService;
import com.ballejos.mywebsiteback.service.ReadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProjectMapper {

    @Autowired
    private ReadFileService readFileService;
    @Autowired
    private MarkdownParserService markdownParserService;

    public AnswerGetProject toAnswerGetProject(ProjectModel projectModel) {
        String markDownContent = readFileService.readFile("projectContents/" + projectModel.getIdStr() +
                ".md");

        return new AnswerGetProject(
                projectModel.getIdStr(),
                projectModel.getImg(),
                projectModel.getTitre(),
                markdownParserService.markdownToHtml(markDownContent));
    }

    public List<AnswerGetProject> toAnswerGetProjects(List<ProjectModel> projectModels) {
        List<AnswerGetProject> answerGetProjects = new ArrayList<>();
        for (ProjectModel projectModel : projectModels) {
            answerGetProjects.add(toAnswerGetProject(projectModel));
        }
        return answerGetProjects;

    }


}
