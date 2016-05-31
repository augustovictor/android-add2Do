package com.augustovictor.add2do.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.augustovictor.add2do.R;

/**
 * Created by victoraweb on 5/31/16.
 */
public class TodoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_item);
    }
}
