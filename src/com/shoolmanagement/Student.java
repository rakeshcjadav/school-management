package com.shoolmanagement;

public class Student extends Person {

    public Student(Integer id, String firstName, GENDER gender) {
        super(id, firstName, gender);
    }

    @Override
    public void Print() {
        System.out.print("Student : ");
        super.Print();
    }
}
