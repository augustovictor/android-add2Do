package com.augustovictor.add2do.Utils;

/**
 * Created by victoraweb on 5/29/16.
 */
public enum Priority {

    high(3),
    medium(2),
    low(1);

    int priority;

    private Priority(int p) {
        this.priority = p;
    }

    public int getPriorityInt() {
        return priority;
    }
}
