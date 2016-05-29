package com.augustovictor.add2do.Models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by victoraweb on 5/29/16.
 */
public class Todo {
    private String mTitle;
    private String mDescription;
    private boolean mDone;
    private Date mCreationDate;

    public Todo() {
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public boolean ismDone() {
        return mDone;
    }

    public void setmDone(boolean mDone) {
        this.mDone = mDone;
    }

    public Date getmCreationDate() {
        return mCreationDate;
    }

    public void setmCreationDate(Date mCreationDate) {
        this.mCreationDate = mCreationDate;
    }

    public static ArrayList<Todo> createTodoList(int numTodos) {
        ArrayList<Todo> todos = new ArrayList<>();

        for(int i = 0; i < numTodos; i++) {
            Todo todo = new Todo();
            todo.setmTitle("Todo " + i);
            todo.setmDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
            todo.setmDone(i % 2 == 0);
            todo.setmCreationDate(new Date());
            todos.add(todo);
        }
        return todos;
    }
}
