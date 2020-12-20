package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @PostMapping("/add")
    public String addToDo(@RequestParam String toDo, @RequestParam String todoDate){
        ToDo todo = new ToDo();
        todo.setToDo(toDo);
        todo.setDue(todoDate);
        toDoRepository.save(todo);
        return "Added new todo!";
    }

    @GetMapping("/list")
    public Iterable<ToDo> getToDo(){
        return toDoRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public ToDo findToDoById(@PathVariable Integer id){
        return toDoRepository.findTodoByToDoId(id);
    }
}
