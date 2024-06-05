package se.lexicon.g49jpaworkshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.AppUser;
import se.lexicon.g49jpaworkshop.entity.Details;

import java.util.Optional;

@SuppressWarnings("ALL")
@Repository
public abstract class DetailsRepository implements JpaRepository<Details, Long> {


    public abstract Optional<AppUser> findByUserDetails_Email (String email);
}
