package com.geo.system.controller;

import com.geo.system.entity.Project;
import com.geo.system.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProjectController {

    @Autowired
    ProjectService projectService;

    public Project insert(Project project) {
        return projectService.insert(project);
    }

    public Iterable<Project> getAll() {
        return projectService.getAll();
    }

    public void deleteById(Integer id) {
        projectService.deleteById(id);
    }

    public Project update(Integer id, Project project) {
        return projectService.update(id, project);
    }
}
