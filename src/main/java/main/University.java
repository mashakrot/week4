package main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class University {
    // Scanner sc = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Grade> grades = new ArrayList<>();

    Grade newGrade = null;


    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Grade grade) {
        grades.add(grade);
    }

    public void listStudents() {
        System.out.println("Students:");
        for (Student student: students) {
            student.printInfo();
        }
    }

    public void listSomehow() {
        int x = 0;
        for (Student student: students) {
            System.out.println(x++ + ": " + student.getName());
        }
    }


    public void addCourseCompletion() {
        Scanner sc = new Scanner(System.in);

        listSomehow();
        System.out.println("Which student do you want to add course completion for?");
        int index = sc.nextInt();

        // String indexString = sc.nextLine();
        // int index = Integer.parseInt(indexString);
        
        // sc.nextLine(); // consume newline
        Student student = students.get(index);
        System.out.println("What is the name of the course?");
        String courseName = sc.nextLine();
        System.out.println("What is the grade of the course?");
        String courseGradeStr = sc.nextLine();
        int courseGrade = Integer.parseInt(courseGradeStr);
        
        // sc.nextLine(); // consume newline
        student.addCourseCompletion(courseName, courseGrade);
    } 

    public void listCourseCompletions() {
        Scanner sc = new Scanner(System.in);

        listSomehow();
        System.out.println("Which student do you want to list course completions for?");
        String studentIndexStr = sc.nextLine();
        int studentIndex = Integer.parseInt(studentIndexStr);

        // sc.nextLine(); // consume newline
        Student student = students.get(studentIndex);
        
        Map<String, Integer> courseCompletions = student.getCourseCompletions();
        for (Map.Entry<String, Integer> entry : courseCompletions.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void calculateAverage() {
        Scanner sc = new Scanner(System.in);

        listSomehow();
        System.out.println("Which student do you want to calculate the average for?");
        int studentIndex = sc.nextInt();
        sc.nextLine(); // consume newline
        Student student = students.get(studentIndex);
        
        Map<String, Integer> courseCompletions = student.getCourseCompletions();
        if (courseCompletions.isEmpty()) {
            System.out.println("No course completions found for the student.");
            return;
        }
        double total = 0;
        for (int courseGrade : courseCompletions.values()) {
            total += courseGrade;
        }
        double average = total / courseCompletions.size();
        System.out.println("Average is " + average);
    }
}
