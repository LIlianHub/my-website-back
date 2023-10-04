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
    @Column(name = "ID")
    private Long id;

    @Column(name = "ID_STR")
    private String idStr;

    @Column(name = "IMG")
    private String img;

    @Column(name = "TITRE")
    private String titre;

    @Column(name = "CONTENU")
    private String contenu;

}
