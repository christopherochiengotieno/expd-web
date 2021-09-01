package com.otienochris.expdweb.services.interfaces;

import com.otienochris.expdweb.domain.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();

    Event getEventById(Long id);

    Event addEvent(Event event);

    void deleteEventById(Long id);

    void updateEvent(Long id, Event newEvent);
}
