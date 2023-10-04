package com.ballejos.mywebsiteback.utils;


import lombok.experimental.UtilityClass;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@UtilityClass
public class RepositoryUtils {

    public <T> List<T> checkIfNotEmpty(List<T> list, ResponseStatusException exception) {
        if (list == null || list.isEmpty()) {
            throw exception;
        }
        return list;
    }

}
