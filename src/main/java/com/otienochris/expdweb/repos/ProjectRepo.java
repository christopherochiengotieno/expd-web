package com.otienochris.expdweb.repos;

import com.otienochris.expdweb.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */

public interface ProjectRepo extends JpaRepository<Project, Long> {
}
