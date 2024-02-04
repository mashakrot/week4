package main;

import java.util.Scanner;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Student newStudent = new Student();
        University university = new University();
        
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Add student, 2) List students, 3) Add course completion for student, 4) List course completions of student, 5) Calculate the average of course completions, 6) Calculate median of course completions, 7) Save students to file, 8) Load students from file, 0) End the program");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("What is the name of the student?");
                        String name = sc.nextLine();
                        System.out.println("What is the student number of the student?");
                        String stnumstr = sc.nextLine();
                        int stnum = Integer.parseInt(stnumstr);


                        newStudent = new Student(name, stnum);
                        university.addStudent(newStudent);

                        break;
                    case 2:
                        university.listStudents();
                        break;
                    case 3:
                        System.out.println("Will be here");
                        break;
                    case 4:
                        System.out.println("Will be here");
                        break;
                    case 5:
                        System.out.println("Will be here");
                        break;
                    case 6:
                        System.out.println("Will be here");
                        break;
                    case 7:
                        System.out.println("Will be here");
                        break;
                    case 8:
                        System.out.println("Will be here");
                        break;
                    case 0:
                        System.out.println("Thank you for using the program.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Wrong input value");
                        break;
                }
            }
        }
    sc.close();
    }
}
