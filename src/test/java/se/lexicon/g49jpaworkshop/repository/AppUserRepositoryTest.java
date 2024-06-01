package se.lexicon.g49jpaworkshop.repository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.g49jpaworkshop.entity.AppUser;
import se.lexicon.g49jpaworkshop.entity.Details;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;



@DataJpaTest
public class AppUserRepositoryTest {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private DetailsRepository detailsRepository;

    @Test
    public void testFindByUsername() {
        Details details = new Details ( LocalDate.of(1990, 1, 1));
        detailsRepository.save(details);

        AppUser user = new AppUser("johndoe", "password", LocalDate.now(), details);
        appUserRepository.save(user);

        Optional<AppUser> foundUser = appUserRepository.findByUsername("johndoe");
        assertThat(foundUser).isPresent();
        assertThat(foundUser.get().getUsername()).isEqualTo("johndoe");
    }

    @Test
    public void testFindByEmailIgnoreCase() {
        Details details = new Details( LocalDate.of(1990, 1, 1));
        detailsRepository.save(details);

        AppUser user = new AppUser("johndoe", "password", LocalDate.now(), details);
        appUserRepository.save(user);

        Optional<AppUser> foundUser = appUserRepository.findByUserDetails_EmailIgnoreCase("TEST@example.com");
        assertThat(foundUser).isPresent();
        assertThat(foundUser.get().getUserDetails().getEmail()).isEqualTo("test@example.com");
    }
}
