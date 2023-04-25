package fa.training.eventbox.controller;

import fa.training.eventbox.model.entity.Event;
import fa.training.eventbox.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events") // GET /events
    public String showList(Model model) {
        List<Event> eventList = eventService.findAll();
        model.addAttribute("eventList", eventList);
        return "events/list"; // foward to view
    }

    @GetMapping("/events/detail") // GET /events/detail
    public String showDetail() {
        return null;
    }
}
