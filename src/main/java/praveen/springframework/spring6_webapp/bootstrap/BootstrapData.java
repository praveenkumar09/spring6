package praveen.springframework.spring6_webapp.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import praveen.springframework.spring6_webapp.domain.Author;
import praveen.springframework.spring6_webapp.domain.Book;
import praveen.springframework.spring6_webapp.domain.Publisher;
import praveen.springframework.spring6_webapp.repositories.AuthorRepository;
import praveen.springframework.spring6_webapp.repositories.BookRepository;
import praveen.springframework.spring6_webapp.repositories.PublisherRepository;


/**
 * Created by TP, Spring Guru
 * Component : Spring Context to detect that and pick it up
 * Command Line Runner : Interface provided by spring boot, detects this type of component on the class path to pick it up and execute the run method
 */
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("David");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("1234");

        Author ericSaved = authorRepository.save(eric);
        Book bookSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("David");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("5678");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved  = bookRepository.save(noEJB);

        ericSaved.getBooks().add(bookSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);


        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());

        Publisher charles = new Publisher();
        charles.setPublisherName("Charles Babbage");
        charles.setAddress("Midfields condominum");
        charles.setCity("New York");
        charles.setState("NY");
        charles.setZip("5001");

        Publisher charlesSaved = publisherRepository.save(charles);
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
