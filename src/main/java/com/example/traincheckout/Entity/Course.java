package com.example.traincheckout.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    Long id;
    String name;
    Long price;

}
