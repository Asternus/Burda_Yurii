package com.burda.hw16.task4;

import java.util.LinkedList;
import java.util.List;

public class Main {

    final protected static List<Student> studentList = new LinkedList<>();

    public static void main(String[] args) {

        studentList.add(new Student("Ivan", "4-J", 4, 5));
        studentList.add(new Student("Dima", "4-J", 4, 3));
        studentList.add(new Student("Anton", "3-J", 3, 2));
        studentList.add(new Student("Ira", "3-J", 3, 1));
        studentList.add(new Student("Egor", "3-J", 3, 2));
        studentList.add(new Student("Elena", "3-J", 3, 2));
        studentList.add(new Student("Maks", "3-J", 3, 2));
        studentList.add(new Student("Kate", "3-J", 3, 2));
        studentList.add(new Student("Kris", "3-J", 3, 1));

        System.out.println(studentList.toString());
        printStudents(studentList, 4);
        System.out.println(delStudents());
    }

    public static List<Student> delStudents() {
        studentList.removeIf(student -> student.getPoints() < 3);
        studentList.removeIf(student -> student.getGrade() > 6);
        studentList.forEach(student -> student.addGrade(1));
        return studentList;
    }

    public static void printStudents(List<Student> students, int grade) {
        students.stream().
                filter(student -> student.getGrade() == grade).
                map(Student::toString).
                forEach(System.out::println);
    }
}

