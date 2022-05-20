package com.hsenid.SpringWebApplication.repositories;

import com.hsenid.SpringWebApplication.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
