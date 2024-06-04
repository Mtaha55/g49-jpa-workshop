package se.lexicon.g49jpaworkshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String isbn;
    @Column
    private String title;
    @Column
    private int maxLoanDay;



    //@OneToMany(mappedBy = "book")
    //private Collection<BookLoan> bookLoan;

    public Book ( String isbn , String title , int maxLoanDay) {
        this.isbn = isbn;
        this.title = title;
        this.maxLoanDay = maxLoanDay;
    }
}
