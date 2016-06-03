package com.augustovictor.add2do.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.augustovictor.add2do.Fragments.TodoFragment;

import java.util.UUID;

/**
 * Created by victoraweb on 5/31/16.
 */
public class TodoActivity extends SingleFragmentActivity {

    private static final String EXTRA_TODO_ID = "com.augustovictor.add2do.todo_id";

    public static Intent newIntent(Context context, UUID todoId) {
        Intent i = new Intent(context, TodoActivity.class);
        i.putExtra(EXTRA_TODO_ID, todoId);
        return i;
    }


    @Override
    protected Fragment createFragment() {
        UUID todoId = (UUID) getIntent().getSerializableExtra(EXTRA_TODO_ID);
        return TodoFragment.newInstance(todoId);
    }
}
