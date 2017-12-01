package nl.sanderkastelein.education.institution.organisation;

import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.education.EducationProviderInterface;
import nl.sanderkastelein.education.institution.people.Employee;
import nl.sanderkastelein.misc.Printable;
import nl.sanderkastelein.misc.Stringable;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Academy implements EducationProviderInterface, Stringable, Printable {

    private String name;

    private String description;

    private List<School> schools = new ArrayList<>();

    private List<Education> educations = new ArrayList<>();

    private List<Employee> employeeList = new ArrayList<>();

    public Academy(String name, String description) {
           this.name = name;
           this.description = description;
    }

    public List<Education> getAllEducations() {
        List<Education> allEducations = new ArrayList<Education>();

        for (School school: schools) {
            allEducations.addAll(school.getEducations());
        }
        allEducations.addAll(educations);
        return allEducations;
    }

    @Override
    public List<Education> getEducations() {
        return educations;
    }

    @Override
    public void addEducation(String education) {
        this.educations.add(new Education(education));
    }

    public void addSchool(School school) {
        this.schools.add(school);
    }

    public void addEmployee(String name, String address, String jobTitle) {
        this.employeeList.add(new Employee(this, name, address, jobTitle));
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() { return name; }

    public List<School> getSchools() {
        return schools;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public void print(PrintWriter writer) {
        writer.write(getName());
    }
}
