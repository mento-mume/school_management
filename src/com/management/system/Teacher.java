package com.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * initializing the teacher object
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    // to return id.
    public int getId() {
        return id;
    }

    // to return name.
    public String getName() {
        return name;
    }

    // to return salary.
    public int getSalary() {
        return salary;
    }
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updatetotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
