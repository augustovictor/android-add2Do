package com.augustovictor.add2do.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.augustovictor.add2do.Adapters.TodosAdapter;
import com.augustovictor.add2do.Models.Todo;
import com.augustovictor.add2do.R;
import com.augustovictor.add2do.Utils.DividerItemDecoration;

import java.util.ArrayList;

public class TodoListActivity extends AppCompatActivity {

    ArrayList<Todo> todos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);

        RecyclerView rvTodos = (RecyclerView) findViewById(R.id.recycler_view);

        todos = Todo.createTodoList(20);

        TodosAdapter adapter = new TodosAdapter(todos);

        rvTodos.setAdapter(adapter);

        rvTodos.setLayoutManager(new LinearLayoutManager(this));

        rvTodos.setHasFixedSize(true);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);

        rvTodos.addItemDecoration(itemDecoration);

    }
}
