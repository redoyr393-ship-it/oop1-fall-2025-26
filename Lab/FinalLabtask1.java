public class Labtask1final {
    class Contact {
    String phone;
    String email;
    // constructor, getters/setters or just public fields
}

class Student {
    String name;
    Contact contact;   // or String phone, String email directly
    // constructor
}

class School {
    String schoolName;
    Student[] students = new Student[1000];  // fixed size
    int studentCount = 0;

    void addStudent(Student s) {
        if (studentCount < students.length) {
            students[studentCount++] = s;
        }
    }

    void printAllStudents() { ... }
}

public class Main {
    public static void main(String[] args) {
        // create school, students, contacts, add them, print
    }
}
}
