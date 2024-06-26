package com.acciojob.Library_management_system.Entities;


import com.acciojob.Library_management_system.CardStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "card_info")
@Getter
@Setter
public class LibraryCard { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    private int noOfBooksIssued;

    private LocalDate validity;


    @JoinColumn
    @OneToOne
    private Student student;

}
