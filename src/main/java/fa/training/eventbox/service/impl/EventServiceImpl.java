package fa.training.eventbox.service.impl;

import fa.training.eventbox.model.entity.Event;
import fa.training.eventbox.repository.EventRepository;
import fa.training.eventbox.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;


    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> findAll() {
        return (List<Event>) eventRepository.findAll();
    }
}
