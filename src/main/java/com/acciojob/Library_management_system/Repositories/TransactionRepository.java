package com.acciojob.Library_management_system.Repositories;

import com.acciojob.Library_management_system.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
