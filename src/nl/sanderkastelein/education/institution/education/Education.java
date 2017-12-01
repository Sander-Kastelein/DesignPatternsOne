package nl.sanderkastelein.education.institution.education;

import nl.sanderkastelein.education.institution.people.Student;
import nl.sanderkastelein.misc.Printable;
import nl.sanderkastelein.misc.Stringable;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Education implements Stringable, Printable{

    private String name;

    private List<Course> courseList;

    private List<Student> studentList;

    /**
     * @param name name of the education
     */
    public Education(String name) {
        this.name = name;
        this.courseList = new ArrayList<>();
        this.studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(String name, String address) {
        studentList.add(new Student(name, address, this));
    }

    public void addCourse(String courseName, String courseDescription) {
        courseList.add(new Course(this, courseName, courseDescription));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void print(PrintWriter writer) {
        writer.write(name);
    }
}
