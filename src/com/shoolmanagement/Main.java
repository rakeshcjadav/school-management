package com.shoolmanagement;

public class Main {
    public static void main(String[] args) {

        School school = new School("Saraswati Vidyala");

        school.Admit("Bal-Krishna", 2, GENDER.MALE);
        school.Admit("Mahek", 7, GENDER.FEMALE);
        school.Admit("Bhakti", 1, GENDER.FEMALE);
        school.DisplayAllStudents();

        school.HireFaculty("Rakesh", GENDER.MALE, DESIGNATION.TEACHER);
        school.HireFaculty("Tejaswini", GENDER.FEMALE, DESIGNATION.PRINCIPAL);
        school.DisplayAllFaculties();
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

// Singleton Pattern