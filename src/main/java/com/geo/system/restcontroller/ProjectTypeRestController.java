package com.geo.system.restcontroller;

import com.geo.system.controller.ProjectController;
import com.geo.system.controller.ProjectTypeController;
import com.geo.system.entity.ProjectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProjectTypeRestController {

    @Autowired
    ProjectTypeController projectTypeController;

    @PostMapping(path = "/insertProjectType")
    public ProjectType insert(@RequestBody @Valid ProjectType projectType) {
        return projectTypeController.insert(projectType);
    }

    @GetMapping(path = "/getAllProjectType")
    public @ResponseBody
    Iterable<ProjectType> getAll() {
        return projectTypeController.getAll();
    }

    @DeleteMapping(path = "/deleteProjectType/{id}")
    public void deleteById(@PathVariable Integer id) {
        projectTypeController.deleteById(id);
    }

    @GetMapping(path = "updateProjectType/{id}")
    public ProjectType update(@PathVariable Integer id, @RequestBody @Valid ProjectType projectType) {
        return projectTypeController.update(id, projectType);
    }

}
