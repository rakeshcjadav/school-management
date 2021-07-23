package com.shoolmanagement;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(0, "Rakesh", GENDER.MALE);
        Facutly facutly = new Facutly(1, "Vijay", GENDER.MALE, DESIGNATION.TEACHER);

        student.Print();
        facutly.Print();
    }
}

/*

Student : Name, id, Standard, gender
Faculty : Name, id, designation, Standard, Salary, gender
Standard : Number, sub-standard, Faculty, student_limit { min, max }
Salary : id, Value
Designation : { Teacher, Principal, Vice-Principal, Visiting-Teacher, Ad-hoc Teacher }

School : Name { Addmission, Leaving, Hiring }



 */