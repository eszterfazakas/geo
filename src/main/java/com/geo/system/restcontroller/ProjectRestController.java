package com.geo.system.restcontroller;

import com.geo.system.controller.ProjectController;
import com.geo.system.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProjectRestController {

    @Autowired
    ProjectController projectController;

    @PostMapping(path = "/insertProject")
    public Project insert(@RequestBody @Valid Project project) {
        return projectController.insert(project);
    }

    @GetMapping(path = "/getAllProject")
    public @ResponseBody
    Iterable<Project> getAll() {
        return projectController.getAll();
    }

    @DeleteMapping(path = "/deleteProject/{id}")
    public void deleteById(@PathVariable Integer id) {
        projectController.deleteById(id);
    }

    @GetMapping(path = "updateProject/{id}")
    public Project update(@PathVariable Integer id, @RequestBody
    @Valid Project project) {
        return projectController.update(id, project);
    }
}
