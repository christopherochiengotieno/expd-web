package com.otienochris.expdweb.services.implementationsV1;

import com.otienochris.expdweb.Exceptions.EventNotFoundException;
import com.otienochris.expdweb.domain.Event;
import com.otienochris.expdweb.repos.EventRepo;
import com.otienochris.expdweb.services.interfaces.EventService;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */
@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {


    private final EventRepo eventRepo;

    @Override
    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepo.getById(id);
    }

    @Override
    public Event addEvent(Event event) {
        Long id = eventRepo.save(event).getId();
        return eventRepo.findById(id).orElseThrow();
    }

    @Override
    public void deleteEventById(Long id) {
        eventRepo.findById(id).ifPresentOrElse(eventRepo::delete, () -> {
            throw new EventNotFoundException(id);
        });
    }

    @Override
    public void updateEvent(Long id, Event newEvent) {
        eventRepo.findById(id).ifPresentOrElse(event -> {
            event.setDate(newEvent.getDate());
            event.setDescription(newEvent.getDescription());
            event.setLinks(newEvent.getLinks());
            event.setTitle(newEvent.getTitle());
            eventRepo.save(event);
        }, () -> { throw new EventNotFoundException(id);});
    }
}
