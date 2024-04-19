package com.example.pucpr.crudexample.repository;

import com.example.pucpr.crudexample.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
