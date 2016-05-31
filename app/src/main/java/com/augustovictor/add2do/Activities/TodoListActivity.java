package com.augustovictor.add2do.Activities;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.augustovictor.add2do.Adapters.TodosAdapter;
import com.augustovictor.add2do.Models.Todo;
import com.augustovictor.add2do.R;
import com.augustovictor.add2do.Utils.DividerItemDecoration;

import java.util.ArrayList;

public class TodoListActivity extends AppCompatActivity {

    ArrayList<Todo> todos;
    private DrawerLayout mDrawer;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle drawerToggle;
    private Toolbar toolbar;
    private FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);
        setUpRecyclerView();
        setUpToolbar();
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        nvDrawer = (NavigationView) findViewById(R.id.navigation_view);
        setupDrawerContent(nvDrawer);

        drawerToggle = setUpDrawerToggle();
        mDrawer.addDrawerListener(drawerToggle);

        addButton = (FloatingActionButton) findViewById(R.id.add_task_btn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), TodoActivity.class);
                startActivity(i);
            }
        });

    }

    // NAVIGATION DRAWER
    private ActionBarDrawerToggle setUpDrawerToggle() {
        return new ActionBarDrawerToggle(this, mDrawer, toolbar, R.string.drawer_open, R.string.drawer_close);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                return false;
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    // MENU OPTIONS
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // TOOLBAR
    public void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        Resources res = getResources();
        String subtitle = res.getQuantityString(R.plurals.tasks_counter, todos.size(), todos.size());
        toolbar.setSubtitle(todos.size() + " " + subtitle);

        setSupportActionBar(toolbar);
    }

    // RECYCLERVIEW
    public void setUpRecyclerView() {

        // RecyclerView
        RecyclerView rvTodos = (RecyclerView) findViewById(R.id.recycler_view);
        todos = Todo.createTodoList(20);

        // Adapter
        TodosAdapter adapter = new TodosAdapter(todos);
        rvTodos.setAdapter(adapter);
        rvTodos.setLayoutManager(new LinearLayoutManager(this));

        // ItemDecoration
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        rvTodos.addItemDecoration(itemDecoration);
        rvTodos.setHasFixedSize(true);

    }

}
