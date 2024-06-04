package se.lexicon.g49jpaworkshop.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.g49jpaworkshop.entity.Book;

import java.util.List;



import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest  // This annotation is used to configure a slice of the application to load only JPA components.
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    /*@Test
    public void testFindByIsbnIgnoreCase ( ) {
        Book book = new Book ( "1234567890" , "Test Book" , 14 );
        bookRepository.save ( book );

        assertThat ( bookRepository.findByIsbnIgnoreCase ( "1234567890" ) ).isPresent ();
        assertThat ( bookRepository.findByIsbnIgnoreCase ( "1234567890" ).get ().getTitle () ).isEqualTo ( "Test Book" );
    }

    @Test
    public void testFindByTitleContainingIgnoreCase ( ) {
        Book book = new Book ( "1234567890" , "Test Book" , 14 );
        bookRepository.save ( book );

        List<Book> foundBooks = bookRepository.findByTitleContainingIgnoreCase ( "test" );
        assertThat ( foundBooks ).hasSameClassAs ( 1 );
        assertThat ( foundBooks.get ( 0 ).getTitle () ).isEqualTo ( "Test Book" );
    }*/
}
