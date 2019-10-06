package com.geo.system.service;

import com.geo.system.dao.ProjectDAO;
import com.geo.system.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectService {
    @Autowired
    ProjectDAO projectDAO;

    public Project insert(Project project) {
        return projectDAO.save(project);
    }

    public Iterable<Project> getAll() {
        return projectDAO.findAll();
    }

    public void deleteById(Integer id) {
        projectDAO.deleteById(id);
    }

    public Project update(Integer id, Project project) {
        return projectDAO.updateProject(id, project);
    }

}
