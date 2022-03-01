package com.burda.hw16.task4;

public class Student {
    private String name;
    private String group;
    private int grade;
    private int points;

    public Student(String name, String group, int grade, int points) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.points = points;
    }

    public int getGrade() {
        return grade;
    }


    public void addGrade(int grade) {
        this.grade += grade;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", grade=" + grade +
                ", points=" + points +
                '}';
    }
}
