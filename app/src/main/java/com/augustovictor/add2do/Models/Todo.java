package com.augustovictor.add2do.Models;

import java.util.ArrayList;

/**
 * Created by victoraweb on 5/29/16.
 */
public class Todo {
    private String title;
    private String description;
    private boolean done;

    public Todo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    private static ArrayList<Todo> createTodoList(int numTodos) {
        ArrayList<Todo> todos = new ArrayList<>();

        for(int i = 0; i < numTodos; i++) {
            Todo todo = new Todo();
            todo.setTitle("Todo " + i);
            todo.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
            todo.setDone(i % 2 == 0);
            todos.add(todo);
        }
        return todos;
    }
}
