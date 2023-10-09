package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetProject;
import com.ballejos.mywebsiteback.model.ProjectModel;
import com.ballejos.mywebsiteback.service.MarkdownParserService;
import com.ballejos.mywebsiteback.service.ReadFileService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectMapperTest {

    @InjectMocks
    private ProjectMapper projectMapper;

    @Mock
    private ReadFileService readFileService;

    @Mock
    private MarkdownParserService markdownParserService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testToAnswerGetProject() {
        // Configuration du comportement du mock pour le service de lecture de fichier
        ProjectModel projectModel = new ProjectModel();
        projectModel.setIdStr("project1");
        projectModel.setImg("image.jpg");
        projectModel.setTitre("Titre du projet");
        when(readFileService.readFile("projectContents/project1.md")).thenReturn("Contenu en markdown");

        // Configuration du comportement du mock pour le service de conversion Markdown en HTML
        when(markdownParserService.markdownToHtml("Contenu en markdown")).thenReturn("Contenu en HTML");

        // Appel de la méthode à tester
        AnswerGetProject answer = projectMapper.toAnswerGetProject(projectModel);

        // Assertions
        verify(readFileService).readFile("projectContents/project1.md"); // Vérifie que la méthode du mock a été appelée
        verify(markdownParserService).markdownToHtml("Contenu en markdown"); // Vérifie que la méthode du mock a été appelée
        assertEquals("project1", answer.getId()); // Vérifie l'ID
        assertEquals("image.jpg", answer.getImg()); // Vérifie l'image
        assertEquals("Titre du projet", answer.getTitre()); // Vérifie le titre
        assertEquals("Contenu en HTML", answer.getContenu()); // Vérifie le contenu en HTML
    }

    @Test
    public void testToAnswerGetProjects() {
        // Créez une liste d'objets ProjectModel de test
        List<ProjectModel> projectModels = new ArrayList<>();
        ProjectModel model1 = new ProjectModel();
        model1.setIdStr("project1");
        ProjectModel model2 = new ProjectModel();
        model2.setIdStr("project2");
        projectModels.add(model1);
        projectModels.add(model2);

        // Configuration du comportement du mock pour le service de lecture de fichier
        when(readFileService.readFile("projectContents/project1.md")).thenReturn("Contenu en markdown 1");
        when(readFileService.readFile("projectContents/project2.md")).thenReturn("Contenu en markdown 2");

        // Configuration du comportement du mock pour le service de conversion Markdown en HTML
        when(markdownParserService.markdownToHtml("Contenu en markdown 1")).thenReturn("Contenu en HTML 1");
        when(markdownParserService.markdownToHtml("Contenu en markdown 2")).thenReturn("Contenu en HTML 2");

        // Appel de la méthode à tester
        List<AnswerGetProject> answers = projectMapper.toAnswerGetProjects(projectModels);

        // Assertions
        verify(readFileService, times(2)).readFile(anyString()); // Vérifie que la méthode du mock a été appelée deux fois
        verify(markdownParserService, times(2)).markdownToHtml(anyString()); // Vérifie que la méthode du mock a été appelée deux fois
        assertEquals(2, answers.size()); // Vérifie le nombre de réponses
        assertEquals("project1", answers.get(0).getId()); // Vérifie l'ID du premier projet
        assertEquals("project2", answers.get(1).getId()); // Vérifie l'ID du deuxième projet
        assertEquals("Contenu en HTML 1", answers.get(0).getContenu()); // Vérifie le contenu HTML du premier projet
        assertEquals("Contenu en HTML 2", answers.get(1).getContenu()); // Vérifie le contenu HTML du deuxième projet
    }
}
