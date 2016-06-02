package com.augustovictor.add2do.Utils;

/**
 * Created by victoraweb on 5/29/16.
 */
public enum TodoPriorityEnum {

    high(3),
    medium(2),
    low(1);

    int priority;

    private TodoPriorityEnum(int p) {
        this.priority = p;
    }

    public int getPriorityInt() {
        return priority;
    }
}
