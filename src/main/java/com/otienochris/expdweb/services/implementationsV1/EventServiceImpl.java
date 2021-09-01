package com.otienochris.expdweb.services.implementationsV1;

import com.otienochris.expdweb.domain.Event;
import com.otienochris.expdweb.services.interfaces.EventService;

import java.util.List;
/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */
public class EventServiceImpl implements EventService {
    @Override
    public List<Event> getAllEvents() {
        return null;
    }

    @Override
    public Event getEventById(Long id) {
        return null;
    }

    @Override
    public Event addEvent(Event event) {
        return null;
    }

    @Override
    public void deleteEventById(Long id) {

    }

    @Override
    public void updateEvent(Long id, Event newEvent) {

    }
}
