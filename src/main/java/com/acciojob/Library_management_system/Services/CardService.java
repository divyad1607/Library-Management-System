package com.acciojob.Library_management_system.Services;

import com.acciojob.Library_management_system.CardStatus;
import com.acciojob.Library_management_system.Entities.LibraryCard;
import com.acciojob.Library_management_system.Entities.Student;
import com.acciojob.Library_management_system.Repositories.CardRepository;
import com.acciojob.Library_management_system.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private StudentRepository studentRepository;

    public String generateCard(){

      //I want to save some cards to the DB

        LibraryCard card = new LibraryCard();

        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBooksIssued (0);

        Date expiryDate = new Date(1028,6,1);
        card.setValidity(expiryDate);
        card = cardRepository.save(card);

        return "The card has been generated with cardId" +card.getCardNo();

    }

    public String associateCardAndStudent(Integer cardId,Integer studentId){


        LibraryCard libraryCard = cardRepository.findById(cardId).get();
        Student student = studentRepository.findById(studentId).get();
        libraryCard.setCardStatus(CardStatus.ISSUED);
        libraryCard.setStudent(student);

        cardRepository.save(libraryCard);

        return "The card and statement has been associated";
    }


}
