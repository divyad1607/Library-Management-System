package com.acciojob.Library_management_system.Repositories;

import com.acciojob.Library_management_system.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
