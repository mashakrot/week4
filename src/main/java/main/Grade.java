package main;

import java.io.Serializable;

public class Grade implements Serializable {
    private String courseName;
    private int courseGrade;


    public Grade(String courseName, int courseGrade) {
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }

    public void printInfo() {
        System.out.println(courseName + ": " + courseGrade);
    }

}
