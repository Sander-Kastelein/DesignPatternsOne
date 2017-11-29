package nl.sanderkastelein.education.institution.people;

import nl.sanderkastelein.education.institution.education.Education;

public class Student extends AbstractPerson {

    private Education education;

    private int points = 0;

    public Student(String name, String address, Education education) {
        super(name, address);
        this.education = education;
        this.education.addStudent(this);
    }

    public Education getEducation() {
        return education;
    }

    public int getPoints() {
        return points;
    }
}
