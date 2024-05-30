package se.lexicon.g49jpaworkshop.repository;



import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);

    Optional<AppUser> findByUserDetails_EmailIgnoreCase(String email);
}
