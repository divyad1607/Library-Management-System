package com.acciojob.Library_management_system.Entities;

import com.acciojob.Library_management_system.Enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    @CreatedDate
    private Date issueDate;

    private Date returnDate;

    private Integer fineAmount;

    @JoinColumn
    @ManyToOne
    private  LibraryCard card;

    @JoinColumn
    @ManyToOne
    private Book book;
}
