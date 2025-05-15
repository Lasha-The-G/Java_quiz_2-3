package oop.q3;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student me = new Student("John", "john123", "USA", "My info", "20250001", List.of("Math", "OOP", "Algorithms"));
        Student friend = new Student("Anna", "anna456", "UK", "Friend info", "20250002", List.of("Biology", "History"));

        University uni = new University();

        uni.addStudent(friend);

        // Yourself not in university yet → Case 2
        System.out.println(uni.getStudentInfoStrange(me)); // Outputs: 20250001

        // Add yourself
        uni.addStudent(me);

        // Yourself in university → Case 1
        System.out.println(uni.getStudentInfoStrange(me)); // Outputs: Math, OOP, Algorithms

        // Friend in university → Case 3
        System.out.println(uni.getStudentInfoStrange(friend)); // Outputs: Friend info

        // Unknown student → Case 3 null
        Student unknown = new Student("Ghost", "ghost999", "Nowhere", "No info", "20250099", List.of());
        System.out.println(uni.getStudentInfoStrange(unknown)); // Outputs: null
    }
}
