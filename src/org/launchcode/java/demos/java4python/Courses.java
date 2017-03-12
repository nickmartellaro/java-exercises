package org.launchcode.java.demos.java4python;

import java.util.ArrayList;

/**
 * Created by Nick Martellaro on 3/12/2017.
 */
public class Courses {

    private String courseTitle;
    private final Integer courseCredits;
    public ArrayList<String> enrolledStudents;

    public String getEnrolledStudents(String aStudent) {

        return enrolledStudents.getName(aStudent);
    }

    public void setEnrolledStudents(String aStudent) {
        enrolledStudents.add(setName(astudent));

    }
}

