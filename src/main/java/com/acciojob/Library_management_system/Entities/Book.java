package com.acciojob.Library_management_system.Entities;

import com.acciojob.Library_management_system.Enums.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;

@Entity
@Table
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer bookId;

    @Column(unique = true)
    private String title;

    private Integer noOfPages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Integer price;

    private Boolean isIssued;

    @JoinColumn
    @ManyToOne
    private Author author;


}
