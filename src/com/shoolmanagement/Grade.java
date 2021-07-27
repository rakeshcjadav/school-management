package com.shoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class Grade {

    private Integer Number;
    private List<String> Subjects = new ArrayList<>();

    public Grade(Integer number)
    {
        Number = number;
    }

    public void AssignSubjects(List<String> listOfSubjects)
    {
        Subjects.addAll(listOfSubjects);
    }
}
