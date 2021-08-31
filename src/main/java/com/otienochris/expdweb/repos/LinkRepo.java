package com.otienochris.expdweb.repos;

import com.otienochris.expdweb.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepo extends JpaRepository<Link, Long> {
}
