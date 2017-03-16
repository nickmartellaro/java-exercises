package org.launchcode.java.demos.java4python;

import java.util.Random;

/**
 * Created by Nick Martellaro on 3/12/2017.
 */
public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        this.gpa = (this.gpa * numberOfCredits + grade) / (numberOfCredits + courseCredits);
        this.numberOfCredits = numberOfCredits + courseCredits;


    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        String gradeLevel;

        if (this.numberOfCredits > 90) {
            gradeLevel = "Senior";

        } else if ((60 < this.numberOfCredits) && (this.numberOfCredits < 89)) {
                gradeLevel = "Junior";
        } else if ((30 < this.numberOfCredits) && (this.numberOfCredits < 59)) {
            gradeLevel = "Sophomore";
        } else if ((0 < this.numberOfCredits) && (this.numberOfCredits < 29)) {
            gradeLevel = "Freshman";
        }
        return gradeLevel;

            }



    /* getters and setters omitted */

    public static int getNextStudentId() {
        return nextStudentId;
    }

    public static void setNextStudentId(int nextStudentId) {
        Student.nextStudentId = nextStudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

