package praveen.springframework.spring6_webapp.services;

import praveen.springframework.spring6_webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
