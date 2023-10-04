package com.ballejos.mywebsiteback.mapper;

import com.ballejos.mywebsiteback.entity.AnswerGetHomeData;
import com.ballejos.mywebsiteback.model.HomeDataModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HomeDataMapper {

    public AnswerGetHomeData toAnswerGetHomeData(HomeDataModel homeDataModel) {
        return new AnswerGetHomeData(homeDataModel.getContenu());
    }

    public List<AnswerGetHomeData> toAnswerGetHomeDatas(List<HomeDataModel> homeDataModels) {
        List<AnswerGetHomeData> answerGetHomeDatas = new ArrayList<>();
        for (HomeDataModel homeDataModel : homeDataModels) {
            answerGetHomeDatas.add(toAnswerGetHomeData(homeDataModel));
        }
        return answerGetHomeDatas;

    }


}
