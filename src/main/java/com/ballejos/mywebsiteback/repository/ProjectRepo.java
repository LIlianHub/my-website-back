package com.ballejos.mywebsiteback.repository;


import com.ballejos.mywebsiteback.model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProjectRepo extends JpaRepository<ProjectModel, Long> {
    Optional<ProjectModel> findByIdStr(String id_str);

}







