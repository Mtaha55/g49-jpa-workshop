package se.lexicon.g49jpaworkshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.AppUser;
import se.lexicon.g49jpaworkshop.entity.Details;

import java.util.Optional;

@SuppressWarnings("ALL")
@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {


    Optional<AppUser> findByUserDetails_EmailIgnoreCase(String email);
}
