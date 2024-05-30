package se.lexicon.g49jpaworkshop.repository;



import org.springframework.stereotype.Repository;
import se.lexicon.g49jpaworkshop.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
    List<AppUser> findByRegDateBetween(LocalDate startDate, LocalDate endDate);
    Optional<AppUser> findByUserDetails_Id(Long userDetails_id);
    Optional<AppUser> findByUserDetails_EmailIgnoreCase(String email);
}
