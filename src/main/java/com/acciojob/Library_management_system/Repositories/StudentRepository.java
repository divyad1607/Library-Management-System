package com.acciojob.Library_management_system.Repositories;


import com.acciojob.Library_management_system.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer > {
}
