package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Project;

import java.util.List;

public interface ProjectService {

    List<Project> getAllProjects();

    Project getProjectById(Long id);

    Project addProject(Project event);

    void deleteProjectById(Long id);

    void updateProject(Long id, Project newProject);
}
