package com.ballejos.mywebsiteback.repository;


import com.ballejos.mywebsiteback.model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<ProjectModel, Long> {
}

