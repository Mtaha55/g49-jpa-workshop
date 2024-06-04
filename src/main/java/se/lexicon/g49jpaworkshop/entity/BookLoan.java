package se.lexicon.g49jpaworkshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class BookLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)  // The loanDate column must not be null.
    private LocalDate loanDate;

    @Column(nullable = false)  // The dueDate column must not be null.
    private LocalDate dueDate;

    @Column(nullable = false)  // The returned column must not be null.
    private boolean returned;

    //@ManyToOne  // Many-to-one relationship with the AppUser entity.
    //private AppUser borrower;

    //@ManyToOne  // Many-to-one relationship with the Book entity.
    //private Book book;


    // Getters and setters


}
