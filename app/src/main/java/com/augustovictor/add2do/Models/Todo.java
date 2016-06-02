package com.augustovictor.add2do.Models;

import java.util.Date;
import java.util.UUID;

/**
 * Created by victoraweb on 5/29/16.
 */
public class Todo {
    private String mTitle;
    private String mDescription;
    private boolean mDone;
    private Date mCreationDate;
    private int mPriority;
    private UUID id;

    public Todo() {
        this.id = UUID.randomUUID();
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

    public UUID getId() {
        return id;
    }
}
