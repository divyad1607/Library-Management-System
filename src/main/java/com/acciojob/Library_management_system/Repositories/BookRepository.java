package com.acciojob.Library_management_system.Repositories;

import com.acciojob.Library_management_system.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
