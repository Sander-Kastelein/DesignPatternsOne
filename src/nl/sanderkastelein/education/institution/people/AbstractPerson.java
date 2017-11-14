package nl.sanderkastelein.education.institution.people;

public class AbstractPerson {

    private String name;

    private String address;

    public AbstractPerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
