/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Student {
    private String studentNumber;
    private String fullName;
    private int credits;
    private double avgScore;
   
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public Student(String studentNumber, String fullName, int credits, double avgScore) {
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.credits = credits;
        this.avgScore = avgScore;
    }

    public Student() {
    }
  
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Number: ");
        studentNumber = sc.nextLine();
        System.out.println("Enter Student Full Name: ");
        fullName = sc.nextLine();
        System.out.println("Enter total number of credits earned: ");
        credits = sc.nextInt();
        System.out.println("Enter Average Score: ");
        avgScore = sc.nextDouble();
    }
    
    public void output(){
        System.out.println("-Student Number: "+studentNumber+
                "\n-Student Full Name: "+fullName
                +"\n-Total number of credits earned: "+credits+
                "\n-Average Score: "+avgScore);    
    }
    
    public abstract boolean graduation();
    }

