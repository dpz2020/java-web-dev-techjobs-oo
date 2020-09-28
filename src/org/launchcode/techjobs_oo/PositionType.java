package org.launchcode.techjobs_oo;

public class PositionType extends JobField {
//    private int id;
//    private static int nextId = 1;
//    private String value;

//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }

//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//

    public PositionType(String value) {
        super(value);
    }




    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((PositionType)obj).id;
    }


    public String toString() {
        return this.getValue();
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
