package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetHomeData;
import com.ballejos.mywebsiteback.model.HomeDataModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeDataMapperTest {

    private HomeDataMapper homeDataMapper;

    @BeforeEach
    public void setUp() {
        homeDataMapper = new HomeDataMapper();
    }

    @Test
    public void testToAnswerGetHomeData() {
        HomeDataModel homeDataModel = new HomeDataModel();
        homeDataModel.setContenu("Contenu de test");

        AnswerGetHomeData answerGetHomeData = homeDataMapper.toAnswerGetHomeData(homeDataModel);

        assertEquals("Contenu de test", answerGetHomeData.getContenu());
    }

    @Test
    public void testToAnswerGetHomeDatas() {
        HomeDataModel model1 = new HomeDataModel();
        model1.setContenu("Contenu 1");

        HomeDataModel model2 = new HomeDataModel();
        model2.setContenu("Contenu 2");

        List<HomeDataModel> homeDataModels = Arrays.asList(model1, model2);

        List<AnswerGetHomeData> answerGetHomeDatas = homeDataMapper.toAnswerGetHomeDatas(homeDataModels);

        assertEquals(2, answerGetHomeDatas.size());
        assertEquals("Contenu 1", answerGetHomeDatas.get(0).getContenu());
        assertEquals("Contenu 2", answerGetHomeDatas.get(1).getContenu());
    }
}
