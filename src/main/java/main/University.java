package main;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }


    public void listStudents() {
        System.out.println("Students:");
        for (Student student: students) {
            student.printInfo();
        }
    }
}
