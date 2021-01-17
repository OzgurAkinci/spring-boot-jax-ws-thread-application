package com.app.threadcxfjaxwsserver.repository;

import com.app.threadcxfjaxwsserver.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
