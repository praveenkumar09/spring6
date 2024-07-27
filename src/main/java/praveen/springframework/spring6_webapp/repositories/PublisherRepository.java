package praveen.springframework.spring6_webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import praveen.springframework.spring6_webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
