package nl.sanderkastelein.education.institution.people;

public class Employee extends AbstractPerson {

    private String jobTitle;

    public Employee(String name, String address, String jobTitle) {
        super(name, address);
        this.jobTitle = jobTitle;
    }
}
