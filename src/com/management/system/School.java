package com.management.system;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalmoneyEarned;
    private static int totalmoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalmoneyEarned = 0;
         totalmoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
       teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getMoneyEarned() {
        return totalmoneyEarned;
    }

    public static void updatetotalMoneyEarned(int moneyEarned) {
     totalmoneyEarned +=moneyEarned;
    }

    public int getMoneySpent() {
        return totalmoneySpent;
    }

    public static void updatetotalMoneySpent(int moneySpent) {
        totalmoneyEarned -=moneySpent;
    }
}
