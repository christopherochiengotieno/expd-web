package com.otienochris.expdweb.repos;

import com.otienochris.expdweb.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */
public interface EventRepo extends JpaRepository<Event, Long> {
}
