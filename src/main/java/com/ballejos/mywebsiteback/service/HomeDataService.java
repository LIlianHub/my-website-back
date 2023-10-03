package com.ballejos.mywebsiteback.service;

import com.ballejos.mywebsiteback.entity.AnswerGetHomeData;
import com.ballejos.mywebsiteback.mapper.HomeDataMapper;
import com.ballejos.mywebsiteback.repository.HomeDataRepo;
import com.ballejos.mywebsiteback.utils.RepositoryUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
@RequiredArgsConstructor
public class HomeDataService {

    private final HomeDataMapper homeDataMapper;
    private final HomeDataRepo homeDataRepo;

    public List<AnswerGetHomeData> getAllHomeData() {
        return homeDataMapper.toAnswerGetHomeDatas(
                RepositoryUtils.checkIfNotEmpty(homeDataRepo.findAll(),
                        new ResponseStatusException(
                                HttpStatus.INTERNAL_SERVER_ERROR,
                                "HomeDataError: Something went wrong please try later")
                )
        );
    }


}

