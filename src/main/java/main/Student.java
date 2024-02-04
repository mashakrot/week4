package main;

import java.io.Serializable;
import java.util.ArrayList;


public class Student implements Serializable {
    private String name;
    private int stnum;
    private ArrayList<Grade> grades = new ArrayList<>();

    public Student() {
        this("", 0);
    }

    public Student(String name, int stnum) {
        this.name = name;
        this.stnum = stnum;

    }

    public void printInfo() {
        System.out.println(stnum + ": " + name);
    }

}

