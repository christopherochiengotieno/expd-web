package com.otienochris.expdweb.repos;

import com.otienochris.expdweb.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event, Long> {
}
