package com.ballejos.mywebsiteback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "homeDatas")
public class HomeDataModel {

    @Id
    private Long id;

    private String contenu;

}
