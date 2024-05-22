package com.acciojob.Library_management_system.Repositories;


import com.acciojob.Library_management_system.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {


}

