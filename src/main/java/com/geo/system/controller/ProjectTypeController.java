package com.geo.system.controller;

import com.geo.system.entity.ProjectType;
import com.geo.system.service.ProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProjectTypeController {

    @Autowired
    ProjectTypeService projectTypeService;

    public ProjectType insert(ProjectType projectType) {
        return projectTypeService.insert(projectType);
    }

    public Iterable<ProjectType> getAll() {
        return projectTypeService.getAll();
    }

    public void deleteById(Integer id) {
        projectTypeService.deleteById(id);
    }

    public ProjectType update(Integer id, ProjectType projectType) {
        return projectTypeService.update(id, projectType);
    }
}
