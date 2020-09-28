package org.launchcode.techjobs_oo;

public abstract class JobField {


    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;

    }

    private static int nextId = 1;

    public int getId() {
        return id;
    }

    protected int id;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

}
