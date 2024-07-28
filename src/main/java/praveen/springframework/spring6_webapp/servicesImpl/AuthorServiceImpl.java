package praveen.springframework.spring6_webapp.servicesImpl;

import org.springframework.stereotype.Service;
import praveen.springframework.spring6_webapp.domain.Author;
import praveen.springframework.spring6_webapp.repositories.AuthorRepository;
import praveen.springframework.spring6_webapp.services.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
