package se.lexicon.g49jpaworkshop.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    @Getter
    @Column(unique = true)
    private String username;
    private String password;
    private LocalDate regDate;

    @OneToOne
    @JoinColumn(name = "details_id")
    private Details userDetails;

    // Constructors, getters, and setters
    public AppUser(String username, String password, LocalDate regDate, Details userDetails) {
        this.username = username;
        this.password = password;
        this.regDate = regDate;
        this.userDetails = userDetails;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    // Other fields, getters, and setters

    public void setId(Integer id) {
        this.id = id;
    }


    // Getters and Setters
}