package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Student implements Serializable {
    private String name;
    private int stnum;
    private LinkedHashMap<String, Integer> courseCompletions;

    public Student() {
        this("", 0);
    }

    public Student(String name, int stnum) {
        this.name = name;
        this.stnum = stnum;
        this.courseCompletions = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(stnum + ": " + name);
    }

    public Map<String, Integer> getCourseCompletions() {
        return courseCompletions;
    }

    public void addCourseCompletion(String courseName, int courseGrade) {
        courseCompletions.put(courseName, courseGrade);
    }
}

