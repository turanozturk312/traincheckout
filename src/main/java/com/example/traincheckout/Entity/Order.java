package com.example.traincheckout.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    User user;

    @OneToOne
    List<Course> courses;

    Long totalPrice;
}
