package com.java8code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentQueries {

    public static List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        studentList.add(new Student(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        studentList.add(new Student(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 10000.0));
        studentList.add(new Student(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        studentList.add(new Student(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        studentList.add(new Student(166, "Igbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        studentList.add(new Student(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        studentList.add(new Student(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        studentList.add(new Student(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        studentList.add(new Student(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        studentList.add(new Student(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        studentList.add(new Student(222, "Nitin Josi", 25, "Male", "Product Development", 2016, 28200.0));
        studentList.add(new Student(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        studentList.add(new Student(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        studentList.add(new Student(255, "Ali Biag", 23, "Male", "Infrastructure", 2018, 12700.0));
        studentList.add(new Student(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        studentList.add(new Student(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        return studentList;
    }
    public static void main(String[] args) {

        List<Student> students = getStudentList();

        //1. How many male and female students are there in the organization?
        Map<String, Long> empCount = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        empCount.forEach((key, value) -> System.out.println(key+" "+value));
        System.out.println();

        //2. Print the name of all departments in the organization?
        students.stream().map(Student::getDepartment).distinct().forEach(System.out::println);
        System.out.println();

        //3. Print all the students except department name is Product Development in the organization?
        students.stream().filter(student -> !student.getDepartment().equals("Product Development")).forEach(System.out::println);
        System.out.println();

        //4. Print all the students paying more than 20000 fee?
        students.stream().filter(student -> student.getFee()>20000.0 && student.getFee()<30000.0).forEach(System.out::println);
        System.out.println();

        //5. Print the student with min fee in the organization?
        Student student = students.stream().min((o1, o2) -> o1.getFee().compareTo(o2.getFee())).get();
        System.out.println(student);
        System.out.println();

        //6. Print the departments having more than 12000 avg fee in the organization?
        students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getFee)))
                    .entrySet().stream().filter(entry -> entry.getValue()> 12000.0).forEach(System.out::println);
        System.out.println();

        //7. Print the all the students by sorting the fee in the organization?
        students.stream().sorted((s1, s2) -> s1.getFee().compareTo(s2.getFee())).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();

        //8. Print the student with second max of fee
        Student stud = students.stream().sorted(Comparator.comparingDouble(Student::getFee).reversed()).skip(1).findFirst().get();
        System.out.println(stud);
        System.out.println();

        //9. Increase the 2000 fee who paid less than 20000 in the organization?
        students.stream().filter(s -> s.getFee()<20000).forEach(s -> s.setFee(s.getFee()+2000));
        students.forEach(System.out::println);
    }
}