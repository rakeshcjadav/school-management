package com.shoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class School {

    private Integer studentID = 0;
    private Integer facultyID = 0;
    private final String SchoolName;

    private List<Student> Students = new ArrayList<>();
    private List<Facutly> Faculties = new ArrayList<>();

    public School(String strSchoolName)
    {
        SchoolName = strSchoolName;
    }

    private Integer GenerateStudentID()
    {
        studentID += 1;
        return studentID;
    }

    private Integer GenerateFacultyID()
    {
        facultyID += 1;
        return facultyID;
    }

    public boolean Admit(String strStudentName, Integer passing_grade, GENDER gender)
    {
        if(passing_grade < 0 || passing_grade > 12)
            return false;

        Student student = new Student(GenerateStudentID(), strStudentName, gender);
        Students.add(student);

        return true;
    }

    public void HireFaculty(String strFacultyName, GENDER gender, DESIGNATION designation)
    {
        Facutly facutly = new Facutly(GenerateFacultyID(), strFacultyName, gender, designation);
        Faculties.add(facutly);
    }

    public void DisplayAllStudents()
    {
        for(Student student : Students)
        {
            student.Print();
        }
    }

    public void DisplayAllFaculties()
    {
        for(Facutly facutly : Faculties)
        {
            facutly.Print();
        }
    }
}
