package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetHomeData;
import com.ballejos.mywebsiteback.model.HomeDataModel;
import com.ballejos.mywebsiteback.service.ReadFileService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class HomeDataMapperTest {

    @InjectMocks
    private HomeDataMapper homeDataMapper;

    @Mock
    private ReadFileService readFileService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testToAnswerGetHomeData() {
        // Configuration du comportement du mock pour le service de lecture de fichier
        HomeDataModel homeDataModel = new HomeDataModel();
        homeDataModel.setTargetFile("test.txt");
        when(readFileService.readFile("homeDataContents/test.txt")).thenReturn("Contenu de test");

        // Appel de la méthode à tester
        AnswerGetHomeData answer = homeDataMapper.toAnswerGetHomeData(homeDataModel);

        // Assertions
        verify(readFileService).readFile("homeDataContents/test.txt");
        assertEquals("Contenu de test", answer.getContenu());
    }

    @Test
    public void testToAnswerGetHomeDatas() {
        // Créez une liste d'objets HomeDataModel de test
        List<HomeDataModel> homeDataModels = new ArrayList<>();
        HomeDataModel model1 = new HomeDataModel();
        model1.setTargetFile("file1.txt");
        HomeDataModel model2 = new HomeDataModel();
        model2.setTargetFile("file2.txt");
        homeDataModels.add(model1);
        homeDataModels.add(model2);

        // Configuration du comportement du mock pour le service de lecture de fichier
        when(readFileService.readFile("homeDataContents/file1.txt")).thenReturn("Contenu de fichier 1");
        when(readFileService.readFile("homeDataContents/file2.txt")).thenReturn("Contenu de fichier 2");

        // Appel de la méthode à tester
        List<AnswerGetHomeData> answers = homeDataMapper.toAnswerGetHomeDatas(homeDataModels);

        // Assertions
        verify(readFileService).readFile("homeDataContents/file1.txt"); // Vérifie que la méthode du mock a été appelée pour le premier fichier
        verify(readFileService).readFile("homeDataContents/file2.txt"); // Vérifie que la méthode du mock a été appelée pour le deuxième fichier
        assertEquals(2, answers.size()); // Vérifie que le nombre de réponses correspond au nombre de modèles
        assertEquals("Contenu de fichier 1", answers.get(0).getContenu()); // Vérifie le contenu de la première réponse
        assertEquals("Contenu de fichier 2", answers.get(1).getContenu()); // Vérifie le contenu de la deuxième réponse
    }
}

