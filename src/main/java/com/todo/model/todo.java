package com.todo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    private Long id;
    private String task;
    private Boolean completed;

    // Getters and Setters
}
