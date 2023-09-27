package com.ballejos.mywebsiteback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "projects")
public class ProjectModel {

    @Id
    private Long id;

    @Column(name = "idStr")
    private String idStr;

    @Column(name = "img")
    private String img;

    @Column(name = "titre")
    private String titre;

    @Column(name = "contenu")
    private String contenu;

}
