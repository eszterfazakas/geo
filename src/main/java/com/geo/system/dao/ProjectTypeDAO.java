package com.geo.system.dao;

import com.geo.system.entity.ProjectType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProjectTypeDAO extends CrudRepository<ProjectType, Integer> {
    ProjectTypeDAO projectTypeDAO = null;

    default ProjectType updateProjectType(Integer id, ProjectType projectType) {
        Optional<ProjectType> projectTypeToUpdate = findById(id);
        if (projectTypeToUpdate.isPresent()) {
            ProjectType projectTypeWithIdFound = projectTypeToUpdate.get();
            projectTypeWithIdFound.setPrice(projectType.getPrice());
            projectTypeWithIdFound.setTypeName(projectType.getTypeName());

            return save(projectTypeWithIdFound);
        }
        return null;
    }
}
