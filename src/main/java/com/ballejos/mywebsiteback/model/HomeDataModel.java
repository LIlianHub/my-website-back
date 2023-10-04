package com.ballejos.mywebsiteback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "HOME_DATAS")
public class HomeDataModel {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CONTENU")
    private String contenu;

}
