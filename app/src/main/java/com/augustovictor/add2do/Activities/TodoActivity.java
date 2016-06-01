package com.augustovictor.add2do.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.augustovictor.add2do.Fragments.TodoFragment;

/**
 * Created by victoraweb on 5/31/16.
 */
public class TodoActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        Intent i = new Intent(context, TodoActivity.class);
        return i;
    }


    @Override
    protected Fragment createFragment() {
        return TodoFragment.newInstance();
    }
}
