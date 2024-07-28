package praveen.springframework.spring6_webapp.servicesImpl;

import org.springframework.stereotype.Service;
import praveen.springframework.spring6_webapp.domain.Book;
import praveen.springframework.spring6_webapp.repositories.BookRepository;
import praveen.springframework.spring6_webapp.services.BookService;

/**
 * Created by TP, Spring Guru
 * Service : indicates the spring context that we are creating a service
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
