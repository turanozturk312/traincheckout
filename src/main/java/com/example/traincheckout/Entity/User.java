package com.example.traincheckout.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class User {

    @Id
    Long id;

    String username;
    String email;

    @OneToMany
    List<Order> orders;
}
