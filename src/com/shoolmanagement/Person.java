package com.shoolmanagement;

enum GENDER {
    MALE,
    FEMALE
}

public class Person {

    // region Protected Variables

    protected Integer ID;
    protected String FirstName;
    protected GENDER Gender;

    // endregion

    // region Getters and Setters

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public GENDER getGender() {
        return Gender;
    }

    public void setGender(GENDER gender) {
        Gender = gender;
    }

    // endregion

    public Person(Integer id, String firstName, GENDER gender)
    {
        this.ID = id;
        this.FirstName = firstName;
        this.Gender = gender;
    }

    public void Print()
    {
        System.out.printf("%d, %s, %s%n", this.ID, this.FirstName, this.Gender.toString());
    }
}
