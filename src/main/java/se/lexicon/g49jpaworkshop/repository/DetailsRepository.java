package se.lexicon.g49jpaworkshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.Details;

import java.util.List;

@SuppressWarnings("ALL")
@Repository

public interface DetailsRepository extends JpaRepository<Details, Integer> {


    default List<Details> findAllById (Iterable<Integer> integers) {
        return null;
    }
}
