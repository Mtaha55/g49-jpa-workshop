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
public class AppUser {
    // Getters and Setters
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    
    private String username;
    
    private String password;
    
    private LocalDate regDate;

    @OneToOne
    private Details userDetails;

    public AppUser (String ignoredJohndoe , String password , LocalDate now , Details ignoredDetails) {
    }

}
