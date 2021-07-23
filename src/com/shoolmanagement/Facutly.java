package com.shoolmanagement;

enum DESIGNATION {
    TEACHER,
    PRINCIPAL,
    VICE_PRINCIPAL,
    VISITING_TEACHER,
    ADHOC_TEACHER
}

public class Facutly extends Person {

    private DESIGNATION Designation;

    // region Getters and Setters

    public DESIGNATION getDesignation() {
        return Designation;
    }

    public void setDesignation(DESIGNATION designation) {
        Designation = designation;
    }

    // endregion

    public Facutly(Integer id, String firstName, GENDER gender, DESIGNATION designation) {
        super(id, firstName, gender);
        this.Designation = designation;
    }

    @Override
    public void Print() {
        System.out.print(String.format("Facutly : %s : ", this.Designation.toString()));
        super.Print();
    }
}
