package com.geo.system.service;

import com.geo.system.dao.ProjectTypeDAO;
import com.geo.system.entity.ProjectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTypeService {

    @Autowired
    ProjectTypeDAO projectTypeDAO;

    public ProjectType insert(ProjectType projectType) {
        return projectTypeDAO.save(projectType);
    }

    public Iterable<ProjectType> getAll() {
        return projectTypeDAO.findAll();
    }

    public void deleteById(Integer id) {
        projectTypeDAO.deleteById(id);
    }

    public ProjectType update(Integer id, ProjectType projectType) {
        return projectTypeDAO.updateProjectType(id, projectType);
    }
}

