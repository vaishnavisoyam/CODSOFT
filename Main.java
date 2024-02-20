
import java.util.ArrayList;


class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

class Course {
    String courseName;
    int courseId;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }
}

class RegistrationSystem {
    ArrayList<Student> students;
    ArrayList<Course> courses;

    public RegistrationSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void registerStudent(Student student) {
        students.add(student);
        System.out.println("Student registered successfully: " + student);
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully: " + course);
    }

    public void displayStudents() {
        System.out.println("Registered Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RegistrationSystem registrationSystem = new RegistrationSystem();

        Student student1 = new Student("lisa han", 101);
        Student student2 = new Student("jisoo neo", 102);

        Course course1 = new Course("java  101", 201);
        Course course2 = new Course("python 101", 202);

        registrationSystem.registerStudent(student1);
        registrationSystem.registerStudent(student2);

        registrationSystem.addCourse(course1);
        registrationSystem.addCourse(course2);

        registrationSystem.displayStudents();
        registrationSystem.displayCourses();
    } 
}