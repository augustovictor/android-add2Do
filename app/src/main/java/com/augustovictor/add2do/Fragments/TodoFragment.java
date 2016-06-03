package com.augustovictor.add2do.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.augustovictor.add2do.Models.Todo;
import com.augustovictor.add2do.Models.TodoSingleton;
import com.augustovictor.add2do.R;
import com.augustovictor.add2do.Utils.OperationTypeEnum;

import java.util.UUID;

/**
 * Created by victoraweb on 5/31/16.
 */
public class TodoFragment extends Fragment {

    private static final String ARG_TODO_ID = "todo_id";

    private Todo mTodo;
    private EditText todoTitleEditText;
    private EditText todoDescriptioneEditText;
    private String operationType;


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
        mTodo = TodoSingleton.get(getActivity()).getmTodo(todoId);
        operationType = getActivity().getIntent().getExtras().get(OperationTypeEnum.OPERATION.toString()).toString();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.todo_fragment, container, false);

        todoTitleEditText = (EditText) view.findViewById(R.id.todo_title_ed);
        todoDescriptioneEditText = (EditText) view.findViewById(R.id.todo_description_ed);

        if(operationType.equals(OperationTypeEnum.EDIT.toString())) {
            todoTitleEditText.setText(mTodo.getmTitle());
            todoDescriptioneEditText.setText(mTodo.getmDescription());
        }


        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
    }
}
