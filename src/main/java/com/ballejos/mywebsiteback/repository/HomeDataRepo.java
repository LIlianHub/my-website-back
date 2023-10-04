package com.ballejos.mywebsiteback.repository;

import com.ballejos.mywebsiteback.model.HomeDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeDataRepo extends JpaRepository<HomeDataModel, Long> {
}
