package com.ballejos.mywebsiteback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "homeDatas")
public class HomeDataModel {

    @Id
    private Long id;

    private String contenu;

}
