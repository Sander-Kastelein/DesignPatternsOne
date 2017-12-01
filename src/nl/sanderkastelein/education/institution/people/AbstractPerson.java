package nl.sanderkastelein.education.institution.people;

import nl.sanderkastelein.misc.Printable;
import nl.sanderkastelein.misc.Stringable;

import java.io.PrintWriter;

public class AbstractPerson implements Stringable, Printable{

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

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void print(PrintWriter writer) {
        writer.write(this.getName());
    }
}
