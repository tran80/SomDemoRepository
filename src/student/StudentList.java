/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Trinh Tran
 */
public class StudentList {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <students.length; i++) {
            System.out.println("Enter the student's name:");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i] = student;
        }
        System.out.println("Printing the students:");
        String format = "The student's name is %s\n";
        for (Student student: students) {
            System.out.printf(format, student.getName());
        }
    }
}
