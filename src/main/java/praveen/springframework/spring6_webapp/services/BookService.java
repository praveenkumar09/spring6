package praveen.springframework.spring6_webapp.services;

import praveen.springframework.spring6_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
