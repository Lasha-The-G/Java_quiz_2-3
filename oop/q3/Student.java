package oop.q3;

import java.util.List;

public class Student {
    String name;
    String username;
    String country;
    String info = "Regular person not from iliauni";
    String personalNumber;
    List<String> courses;  // two variables for new method
    public Student(String name, String username, String country, String info, String personalNumber, List<String> courses) {
        this.name = name;
        this.username = username;
        this.country = country;
        this.info = info;
        this.personalNumber = personalNumber;
        this.courses = courses;
    }
    public void printStudentInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Country: " + country);
        System.out.println("Info: " + info);
    }
}
