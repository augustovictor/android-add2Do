package com.augustovictor.add2do.Utils;

/**
 * Created by victoraweb on 6/3/16.
 */
public enum OperationTypeEnum {

    OPERATION ("OPERATION_TYPE"),
    ADD ("add"),
    EDIT ("edit");

    private final String name;

    private OperationTypeEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
