package com.augustovictor.add2do.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by victoraweb on 5/29/16.
 */
public class Todo {
    private String mTitle;
    private String mDescription;
    private boolean mDone;
    private Date mCreationDate;
    private int mPriority;

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

    public int getmPriority() {
        return mPriority;
    }

    public void setmPriority(int mPriority) {
        this.mPriority = mPriority;
    }

    public static ArrayList<Todo> createTodoList(int numTodos) {
        ArrayList<Todo> todos = new ArrayList<>();

        for(int i = 0; i < numTodos; i++) {
            Todo todo = new Todo();
            todo.setmTitle("Todo " + i);
            todo.setmDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
            todo.setmDone(i % 2 == 0);
            todo.setmCreationDate(new Date());

            Random random = new Random();
            todo.setmPriority(random.nextInt(3) + 1);
            todos.add(todo);

        }
        return todos;
    }
}
