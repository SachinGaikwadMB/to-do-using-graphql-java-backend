package com.mb.graphql.demo.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mb.graphql.demo.api.persistance.entity.ToDoTask;

@Repository
public interface ToDoTaskRepository extends JpaRepository<ToDoTask, Integer>
{

}
