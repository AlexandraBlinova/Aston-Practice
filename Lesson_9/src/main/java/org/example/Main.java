package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иван", "Группа-A", 1, Arrays.asList(4, 3, 5)));
        students.add(new Student("Мария", "Группа-B", 2, Arrays.asList(2, 3, 2)));
        students.add(new Student("Пётр", "Группа-A", 1, Arrays.asList(3, 3, 3)));
        students.add(new Student("Ольга", "Группа-C", 3, Arrays.asList(5, 4, 4)));
        students.add(new Student("Светлана", "Группа-B", 2, Arrays.asList(1, 2, 2)));

        System.out.println("Список студентов до фильтрации:");
        printAllStudents(students);

        removeLowPerformers(students);

        System.out.println("\nСписок студентов после удаления неуспевающих:");
        printAllStudents(students);

        for (Student student : students) {
            advanceStudent(student);
        }

        System.out.println("\nСписок студентов после перевода на следующий курс:");
        printAllStudents(students);

        int targetCourse = 2;
        System.out.println("\nСтуденты, обучающиеся на курсе " + targetCourse + ":");
        printStudents(students, targetCourse);
    }

    public static void removeLowPerformers(Set<Student> students) {
        List<Student> toRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverage() < 3.0) {
                toRemove.add(student);
            }
        }
        students.removeAll(toRemove);
    }

    public static void advanceStudent(Student student) {
        if (student.getAverage() >= 3.0) {
            student.setCourse(student.getCourse() + 1);
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printAllStudents(Set<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}