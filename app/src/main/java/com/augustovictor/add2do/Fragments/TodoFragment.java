package com.augustovictor.add2do.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.augustovictor.add2do.Models.Todo;
import com.augustovictor.add2do.Models.TodoManager;
import com.augustovictor.add2do.R;

import java.util.UUID;

/**
 * Created by victoraweb on 5/31/16.
 */
public class TodoFragment extends Fragment {

    private static final String ARG_TODO_ID = "todo_id";

    private Todo mTodo;
    private EditText todoTitleEditText;
    private EditText todoDescriptioneEditText;


    public static TodoFragment newInstance(UUID todoId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_TODO_ID, todoId);
        TodoFragment fragment = new TodoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID todoId = (UUID) getArguments().getSerializable(ARG_TODO_ID);
        mTodo = TodoManager.get(getActivity()).getmTodo(todoId);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.todo_fragment, container, false);

        todoTitleEditText = (EditText) view.findViewById(R.id.todo_title_ed);
        todoTitleEditText.setText(mTodo.getmTitle());

        todoDescriptioneEditText = (EditText) view.findViewById(R.id.todo_description_ed);
        todoDescriptioneEditText.setText(mTodo.getmDescription());

        return view;
    }
}
