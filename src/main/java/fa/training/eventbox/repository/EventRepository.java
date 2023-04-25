package fa.training.eventbox.repository;

import fa.training.eventbox.model.entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> { // EventDao

}
