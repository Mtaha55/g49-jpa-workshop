package se.lexicon.g49jpaworkshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.BookLoan;

import java.util.List;

@Repository
public interface BookLoanRepository extends JpaRepository<BookLoan, Long> {

  /*  List<BookLoan> findByBorrowerId(long borrower_Id);  // Find book loans by borrower's ID.

    List<BookLoan> findByBookId(long book_Id);  // Find book loans by book ID.



    @Modifying
    @Query("update BookLoan bl set bl.returned = true where bl.id = :loanId")  // Mark a book loan as returned by its loan ID.
    void markAsReturned(Long loanId);*/
}
