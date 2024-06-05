package se.lexicon.g49jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.Book;

import java.util.List;
import java.util.Optional;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByIsbn (String isbn);  // Find book by ISBN (ignore case).


    Optional<Book> findById (long id);

    List<Book> findByTitle (String test);
}