package se.lexicon.g49jpaworkshop.repository;


import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {

}