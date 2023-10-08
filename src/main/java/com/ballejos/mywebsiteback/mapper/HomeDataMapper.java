package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetHomeData;
import com.ballejos.mywebsiteback.model.HomeDataModel;
import com.ballejos.mywebsiteback.service.ReadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HomeDataMapper {

    @Autowired
    private ReadFileService readFileService;

    public AnswerGetHomeData toAnswerGetHomeData(HomeDataModel homeDataModel) {
        String contenu = readFileService.readFile("homeDataContents/" + homeDataModel.getTargetFile());
        return new AnswerGetHomeData(contenu);
    }

    public List<AnswerGetHomeData> toAnswerGetHomeDatas(List<HomeDataModel> homeDataModels) {
        List<AnswerGetHomeData> answerGetHomeDatas = new ArrayList<>();
        for (HomeDataModel homeDataModel : homeDataModels) {
            answerGetHomeDatas.add(toAnswerGetHomeData(homeDataModel));
        }
        return answerGetHomeDatas;

    }


}
