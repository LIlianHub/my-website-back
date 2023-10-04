package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetProject;
import com.ballejos.mywebsiteback.model.ProjectModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectMapperTest {

    private ProjectMapper projectMapper;

    @BeforeEach
    public void setUp() {
        projectMapper = new ProjectMapper();
    }

    @Test
    public void testToAnswerGetProject() {
        ProjectModel projectModel = new ProjectModel();
        projectModel.setIdStr("123");
        projectModel.setImg("image.jpg");
        projectModel.setTitre("Projet test");
        projectModel.setContenu("Contenu du projet de test");

        AnswerGetProject answerGetProject = projectMapper.toAnswerGetProject(projectModel);

        assertEquals("123", answerGetProject.getId());
        assertEquals("image.jpg", answerGetProject.getImg());
        assertEquals("Projet test", answerGetProject.getTitre());
        assertEquals("Contenu du projet de test", answerGetProject.getContenu());
    }

    @Test
    public void testToAnswerGetProjects() {
        ProjectModel model1 = new ProjectModel();
        model1.setIdStr("123");
        model1.setImg("image1.jpg");
        model1.setTitre("Projet 1");
        model1.setContenu("Contenu projet 1");

        ProjectModel model2 = new ProjectModel();
        model2.setIdStr("456");
        model2.setImg("image2.jpg");
        model2.setTitre("Projet 2");
        model2.setContenu("Contenu projet 2");

        List<ProjectModel> projectModels = Arrays.asList(model1, model2);

        List<AnswerGetProject> answerGetProjects = projectMapper.toAnswerGetProjects(projectModels);

        assertEquals(2, answerGetProjects.size());
        assertEquals("123", answerGetProjects.get(0).getId());
        assertEquals("image1.jpg", answerGetProjects.get(0).getImg());
        assertEquals("Projet 1", answerGetProjects.get(0).getTitre());
        assertEquals("Contenu projet 1", answerGetProjects.get(0).getContenu());

        assertEquals("456", answerGetProjects.get(1).getId());
        assertEquals("image2.jpg", answerGetProjects.get(1).getImg());
        assertEquals("Projet 2", answerGetProjects.get(1).getTitre());
        assertEquals("Contenu projet 2", answerGetProjects.get(1).getContenu());
    }
}
