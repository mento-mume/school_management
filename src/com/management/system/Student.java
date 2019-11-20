package com.management.system;

/**
 * class is resonsible for keeping track of students name,grade,fees.
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int totalfees;


    /**
     *
     * @param id unique to differentiate students
     * @param name name of student
     * @param grade grade of student
     */
    public Student(int id, String name,int grade)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feespaid = 0;
        totalfees = 30000;
    }

    /**
     * used to update student grade after promotion
     * @param grade new student grade
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @param fees adding new payments to deposit
     */
    public void payFees(int fees){
        feespaid+=fees;
        School.updatetotalMoneyEarned(feespaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getTotalfees() {
        return totalfees;
    }
    public int getRemainingFees()
    {
       int balance = totalfees-feespaid;
        return balance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feespaid=" + feespaid +
                ", totalfees=" + totalfees +
                '}';
    }
}
