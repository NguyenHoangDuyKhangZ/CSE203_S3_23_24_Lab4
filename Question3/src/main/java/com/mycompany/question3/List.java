/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question3;

import java.util.*;

/**
 *
 * @author Student
 */
public class List {

    Vector<Student> List = new Vector<>();

    public List() {
    }

    public void addNewCollegeStudent() {
        Student stu = new CollegeStudent();
        stu.input();
        List.add(stu);
    }

    public void AddUniversityStudent() {
        Student stu = new UniversityStudent();
        stu.input();
        List.add(stu);
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Number: ");
        String studentCode = sc.nextLine();
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getStudentNumber().equalsIgnoreCase(studentCode)) {
                List.remove(i);
            }
        }
    }

    public void print() {
        for (int i = 0; i < List.size(); i++) {
            List.get(i).output();
            System.out.println("");
        }
    }

    public void printEligibleStudent() {
        int count = 0;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).graduation()) {
                List.get(i).output();
                System.out.println("");
                count++;
            }
            System.out.println("Number of Eligible Student: " + count);
        }
    }

    public void sort() {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                if (s1 instanceof CollegeStudent && s2 instanceof UniversityStudent) {
                    return -1;
                } else if (s1 instanceof UniversityStudent && s2 instanceof CollegeStudent) {
                    return 1;
                } else {
                    return s1.getStudentNumber().compareTo(s2.getStudentNumber());
                }
            }
        };
        List.sort(com);
        print();
    }

    public void findStudentName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String n = sc.nextLine();
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getFullName().contains(n)) {
                List.get(i).output();
                System.out.println();
            }
        }
    }

}
