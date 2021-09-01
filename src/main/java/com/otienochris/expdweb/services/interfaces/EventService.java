package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Event;

import java.util.List;

public interface EventService {
    public List<Event> getAllEvents();
    public Event getEventById(Long id);
}
