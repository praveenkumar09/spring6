package praveen.springframework.spring6_webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import praveen.springframework.spring6_webapp.domain.Author;

/**
 *  Created by TP, Spring Guru
 *
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {

}
