package com.acciojob.Library_management_system.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer authorId;

    private String name;

    private Integer age;

    private String emailId;

    private Double rating;

  //  @Column(defaultValue = 4)
    //@Column(columnDefinition = "INT DEFAULT 0")
    private int noOfBooks;



}
