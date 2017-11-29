package nl.sanderkastelein.education.institution.people;

import nl.sanderkastelein.education.institution.organisation.Academy;

public class Employee extends AbstractPerson {

    private final Academy academy;

    private String jobTitle;

    public Employee(Academy academy, String name, String address, String jobTitle) {
        super(name, address);
        this.academy = academy;
        this.jobTitle = jobTitle;
    }

    public Academy getAcademy() {
        return academy;
    }
}
