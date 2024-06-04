package se.lexicon.g49jpaworkshop.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.g49jpaworkshop.entity.AppUser;
import se.lexicon.g49jpaworkshop.entity.Book;
import se.lexicon.g49jpaworkshop.entity.BookLoan;
import se.lexicon.g49jpaworkshop.entity.Details;

import java.time.LocalDate;



@DataJpaTest  // This annotation is used to configure a slice of the application to load only JPA components.
public class BookLoanRepositoryTest {

    @Autowired
    private BookLoanRepository bookLoanRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AppUserRepository appUserRepository;

   /* @Test
    public void testFindByBorrowerId() {
        Details details = new Details ( "johndoe@example.com" , "John" , "Doe" , LocalDate.of ( 1990 , 1 , 1 ) );
        AppUser user = new AppUser ( "johndoe" , "password" , LocalDate.now () , details );
        appUserRepository.save ( user );

        Book book = new Book ( "1234567890" , "Test Book" , 14 );
        bookRepository.save ( book );
*/
    }
