package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {
    // add remove and print students
    List<Student> students = new ArrayList<>();

    void addStudent(Student s){
        students.add(s);
        System.out.println("studdent added");
    }

    boolean removeStudent(String name){
        for (Student s: students){
            if(s.name.equals(name)){
                students.remove(name);
                System.out.println("Student removed");
                return true;
            }
        }
        return false;
    }

    void printStudents(){
        for (Student s: students){
            s.printStudentInfo();
        }
    }
    String getStudentInfoStrange(Student s) {
        boolean exists = students.contains(s);

        // CASE 1 & 2: if 's' corresponds to yourself
        if (s.username.equals(s.username)) {
            if (exists) {
                // CASE 1: university contains yourself → return your course titles
                return String.join(", ", s.courses);
            } else {
                // CASE 2: university does not contain yourself → return your personal number
                return s.personalNumber;
            }
        }

        // CASE 3: 's' is someone else
        if (exists) {
            return s.info;
        }

        return null;
    }
}
