package nl.sanderkastelein.education.institution.education;

import nl.sanderkastelein.education.institution.people.Student;

import java.util.ArrayList;
import java.util.List;

public class Education {

    private String name;

    private List<Course> courseList;

    private List<Student> studentList;

    /**
     * @param name name of the education
     */
    public Education(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
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

    public void addStudent(Student student) {
        studentList.add(student);
    }
}
