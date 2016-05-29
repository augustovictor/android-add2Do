package com.augustovictor.add2do.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.augustovictor.add2do.Models.Todo;
import com.augustovictor.add2do.R;

import java.util.List;

/**
 * Created by victoraweb on 5/29/16.
 */
public class TodosAdapter extends RecyclerView.Adapter<TodosAdapter.ViewHolder> {

    private List<Todo> mTodos;

    public TodosAdapter(List<Todo> mTodos) {
        this.mTodos = mTodos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View todoView = inflater.inflate(R.layout.list_item_todo, parent, false);

        ViewHolder viewHolder = new ViewHolder(todoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Todo todo = mTodos.get(position);

        CheckBox doneCk = holder.doneCheckBox;
        doneCk.setChecked(todo.ismDone());

        TextView titleTv= holder.titleTextView;
        titleTv.setText(todo.getmTitle());

        TextView descriptionTv = holder.descriptionTextView;
        descriptionTv.setText(todo.getmDescription());

        TextView creationDateTv = holder.creationDateTextView;
        creationDateTv.setText(todo.getmCreationDate().toString());
    }

    @Override
    public int getItemCount() {
        return mTodos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public CheckBox doneCheckBox;
        public TextView titleTextView;
        public TextView descriptionTextView;
        public TextView creationDateTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            doneCheckBox = (CheckBox) itemView.findViewById(R.id.todo_done_ck);
            titleTextView = (TextView) itemView.findViewById(R.id.todo_title_tv);
            descriptionTextView = (TextView) itemView.findViewById(R.id.todo_description_tv);
            creationDateTextView = (TextView) itemView.findViewById(R.id.todo_date_tv);
        }
    }
}
