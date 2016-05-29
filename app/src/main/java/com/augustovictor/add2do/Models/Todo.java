package com.augustovictor.add2do.Models;

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
}
