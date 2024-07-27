package praveen.springframework.spring6_webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import praveen.springframework.spring6_webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
