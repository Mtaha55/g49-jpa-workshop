package se.lexicon.g49jpaworkshop.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.g49jpaworkshop.entity.Author;
import se.lexicon.g49jpaworkshop.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAuthorsByFirstName(String firstName) {
        return authorRepository.findByFirstName(firstName);
    }

    public List<Author> findAuthorsByLastName(String lastName) {
        return authorRepository.findByLastName(lastName);
    }

    public List<Author> findAuthorsByFirstNameOrLastNameContaining(String keyword) {
        return authorRepository.findByFirstNameContainingOrLastNameContaining(keyword, keyword);
    }

    public List<Author> findAuthorsByBookId(Long bookId) {
        return authorRepository.findByBooksBookId(bookId);
    }

    public Author updateAuthorNameById(Long authorId, String firstName, String lastName) {
        Optional<Author> optionalAuthor = authorRepository.findById(authorId);
        if (optionalAuthor.isPresent()) {
            Author author = optionalAuthor.get();
            author.setFirstName(firstName);
            author.setLastName(lastName);
            return authorRepository.save(author);
        }
        return null;
    }

    public void deleteAuthorById(Long authorId) {
        authorRepository.deleteById(authorId);
    }
}
