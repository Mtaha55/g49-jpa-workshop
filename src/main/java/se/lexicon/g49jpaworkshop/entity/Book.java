package se.lexicon.g49jpaworkshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private Long bookId;


    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
    private Long id;
    @Column
    private String isbn;
    @Column
    private String title;
    @Column
    private int maxLoanDay;

    @OneToMany(mappedBy = "book")
    private Collection<BookLoan> bookLoan;

    public Book ( String isbn , String title , int maxLoanDay) {
        this.isbn = isbn;
        this.maxLoanDay = maxLoanDay;
    }
}
