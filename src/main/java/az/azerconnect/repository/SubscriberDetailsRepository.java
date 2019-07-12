package az.azerconnect.repository;

import az.azerconnect.model.SubscriberDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberDetailsRepository extends CrudRepository<SubscriberDetails, Long> {
}
