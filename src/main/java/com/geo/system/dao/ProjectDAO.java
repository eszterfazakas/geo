package com.geo.system.dao;

import com.geo.system.entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProjectDAO extends CrudRepository<Project, Integer> {

    ProjectDAO projectDAO = null;

    default Project updateProject(Integer id, Project project) {
        Optional<Project> projectToUpdate = findById(id);
        if (projectToUpdate.isPresent()) {
            Project projectWithIdFound = projectToUpdate.get();
            projectWithIdFound.setAddress(project.getAddress());
            projectWithIdFound.setDueDate(project.getDueDate());
            projectWithIdFound.setRegistrationDate(project.getRegistrationDate());
            projectWithIdFound.setTitle(project.getTitle());
            projectWithIdFound.setContactId(project.getContactId());
            projectWithIdFound.setProjectTypeId(project.getProjectTypeId());
            projectWithIdFound.setUserId(project.getUserId());


            return save(projectWithIdFound);
        }
        return null;
    }
}
