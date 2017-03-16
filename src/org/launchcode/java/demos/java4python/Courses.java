package org.launchcode.java.demos.java4python;

import java.util.ArrayList;

/**
 * Created by Nick Martellaro on 3/12/2017.
 */
public class Courses {

    private String courseTitle;
//    private final Integer courseCredits;
    public ArrayList<String> enrolledStudents;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

//    public Integer getCourseCredits() {
//        return courseCredits;
//    }

    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<String> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
}

