package com.ballejos.mywebsiteback.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class AnswerGetProject {
       private String id;
       private String img;
       private String titre;
       private String contenu;
}
