package com.otienochris.expdweb.repos;

import com.otienochris.expdweb.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {
}
