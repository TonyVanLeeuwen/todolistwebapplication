package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Integer> {

    ToDo findTodoByToDoId(Integer id);


}
