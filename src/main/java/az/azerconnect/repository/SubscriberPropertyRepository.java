package az.azerconnect.repository;

import az.azerconnect.model.SubscriberProperty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberPropertyRepository extends CrudRepository<SubscriberProperty, Long> {
}
