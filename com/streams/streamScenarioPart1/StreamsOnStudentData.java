package com.streams.streamScenarioPart1;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class Student {
    String firstName, lastName, city, department;
    double grade;
    int age;

    public Student(String firstName, String lastName, String city, double grade, int age, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.grade = grade;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + city + ", " + grade + ", " + age + ", " + department + ")";
    }
}

public class StreamsOnStudentData {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("John", "Smith", "Miami", 8.38, 19, "Civil"),
                new Student("Mike", "Miles", "New York", 8.4, 21, "IT"),
                new Student("Michael", "Peterson", "New York", 7.5, 20, "Civil"),
                new Student("James", "Robertson", "Miami", 9.1, 20, "IT"),
                new Student("John", "Miller", "Miami", 7.83, 20, "Civil")
        );

        // 1. Find students from Miami with a grade greater than 8.0
        List<String> miamiHighGrades = students.stream()
                .filter(s -> s.city.equals("Miami"))
                .filter(s -> s.grade > 8).map(s -> s.firstName)
                .toList();
        System.out.println("students from Miami with a grade greater than 8.0 : " +miamiHighGrades);

        // 2. Find the student with the highest grade
        Student topStudent = students.stream()
                .max(Comparator.comparingDouble(s -> s.grade)).orElse(null);
        System.out.println("student with the highest grade : " + topStudent);

        // 3. Count the number of students in each department
        Map<String, Long> count = students.stream()
                .collect(Collectors.groupingBy(s -> s.department, Collectors.counting()));
        System.out.println("number of students in each department : " + count);

        // 4. Find the average grade per department
        Map<String, Double> avgByDepartment = students.stream()
                .collect(Collectors.groupingBy(s -> s.department, Collectors.averagingDouble(g -> g.grade)));
        System.out.println("average grade per department : " +avgByDepartment);

        // 5. List students sorted by age and then by grade
        List<Student> sorted = students.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.age).thenComparingDouble((Student s) -> s.grade))
                .toList();
        System.out.println("students sorted by age and then by grade : " +sorted);

        // 6. Create a comma-separated list of student names
        String studentsName = students.stream()
                .map(s -> s.firstName)
                .collect(Collectors.joining(", "));
        System.out.println("comma-separated list of student names : "+studentsName);


        // 7. Check if all students are above 18
        Boolean isAllAbove18 = students.stream()
                .allMatch(s -> s.age > 18);
        System.out.println("if all students are above 18 : " +isAllAbove18);


        // 8. Find the department with the most students
        String department = students.stream()
                .collect(Collectors.groupingBy(s -> s.department, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("department with the most students : " + department);


        // 9. Divide students into those who have grades above 8.0 and below
        Map<Boolean, List<Student>> gradePartition = students.stream()
                .collect(Collectors.partitioningBy(s -> s.grade > 8));

        System.out.println("Students with grade above 8.0: " + gradePartition.get(true));
        System.out.println("Students with grade below 8.0: " + gradePartition.get(false));



        // 10. Find the student with the longest full name
        Student studentName =  students.stream()
                .max(Comparator.comparingInt((Student s) -> (s.firstName + s.lastName).length()))
                .orElse(null);
        System.out.println("student with the longest full name: " +studentName);

    }
}