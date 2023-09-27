package com.ballejos.mywebsiteback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "posts")
public class AnswerGetHomeDataModel {

    @Id
    private Long id;

    @Column(name = "id_str")
    private String id_str;

    @Column(name = "img")
    private String img;

    @Column(name = "titre")
    private String titre;

    @Column(name = "contenu")
    private String contenu;

}
