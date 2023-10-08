package com.ballejos.mywebsiteback.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class ReadFileService {

    @Value("${com.ballejos.mywebsiteback.folder.content.location}")
    private String pathProject;

    public String readFile(String fileName) {
        try {
            File file = ResourceUtils.getFile(pathProject + "/" + fileName);
            byte[] fileBytes = Files.readAllBytes(Paths.get(file.getPath()));
            return new String(fileBytes);
        } catch (IOException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "readFileService: Something went wrong please try later");
        }
    }
}


