package com.augustovictor.add2do.Models;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by victoraweb on 6/2/16.
 */
public class TodoManager {
    private static TodoManager sTodoManger;
    private Context mContext;

    private List<Todo> mTodos;

    private TodoManager(Context context) {
        mContext = context.getApplicationContext();
        mTodos = new ArrayList<>() ;
        createTodoList(15);
    }

    public static TodoManager get(Context context) {
        if(sTodoManger == null) {
            sTodoManger = new TodoManager(context);
        }
        return sTodoManger;
    }

    public List<Todo> getmTodos() {
        return this.mTodos;
    }

    private List<Todo> createTodoList(int numTodos) {

        for(int i = 0; i < numTodos; i++) {
            Todo todo = new Todo();
            todo.setmTitle("Todo " + i);
            todo.setmDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
            todo.setmDone(i % 2 == 0);
            todo.setmCreationDate(new Date());

            Random random = new Random();
            todo.setmPriority(random.nextInt(3) + 1);
            mTodos.add(todo);
        }
        return mTodos;
    }
}
