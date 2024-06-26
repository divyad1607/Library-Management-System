package com.acciojob.Library_management_system.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_info")
@Getter
@Setter
@NoArgsConstructor //This is like a default constructor
@AllArgsConstructor //This is like a constructor having all the arguments

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollId;

    @Column(nullable = false)
    private String Name;

    private String branch;

    @Column(nullable = false)
    private double cgpa;

    @Column(unique = true )
    private String emailId;

}
