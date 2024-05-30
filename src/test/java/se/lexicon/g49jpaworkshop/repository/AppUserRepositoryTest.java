package se.lexicon.g49jpaworkshop.repository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.g49jpaworkshop.entity.AppUser;
import se.lexicon.g49jpaworkshop.entity.Details;

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
        Details details = new Details();
        detailsRepository.save(details);

        Optional<AppUser> foundUser = appUserRepository.findByUsername("john doe");
        assertThat(foundUser).isPresent();
    }

    @Test
    public void testFindByEmailIgnoreCase() {
        Details details = new Details();
        detailsRepository.save(details);

        Optional<AppUser> foundUser = appUserRepository.findByUserDetails_EmailIgnoreCase("TEST@example.com");
        assertThat(foundUser).isPresent();
        assertThat(foundUser.get().getUserDetails().getEmail()).isEqualTo("test@example.com");
    }


}
