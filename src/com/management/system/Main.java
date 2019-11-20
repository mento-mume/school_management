package com.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher lizzy = new Teacher(1,"Lizzy",5000);
        Teacher vanderhorn = new Teacher(2,"vanderhorn",6500);
        Teacher melissa = new Teacher(3,"Melissa",3000);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lizzy);
        teachers.add(vanderhorn);
        teachers.add(melissa);


        Student nduke = new Student(1,"Ndukeabasi",6);
        Student kevin = new Student(2,"Kevin",5);
        Student etim = new Student(3,"Etim",2);
        List<Student> students = new ArrayList<>();
        students.add(nduke);
        students.add(kevin);
        students.add(etim);


        School school = new School(teachers,students);
        nduke.payFees(15000);
        System.out.println(school.getMoneyEarned());

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("school has paid salary to "+ lizzy.getName() +" the amount left is $"+ school.getMoneyEarned());

        System.out.println(nduke);
        System.out.println(lizzy);

        Teacher uduak = new Teacher(8,"Uduak Chris",200);
        school.addTeachers(uduak);
        System.out.println(uduak);

    }
}
