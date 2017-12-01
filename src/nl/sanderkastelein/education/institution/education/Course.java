package nl.sanderkastelein.education.institution.education;

import nl.sanderkastelein.misc.Printable;
import nl.sanderkastelein.misc.Stringable;

import java.io.PrintWriter;

public class Course implements Stringable, Printable{

    private Education education;
    private String name;
    private String description;

    public Course(Education education, String name, String description){
        this.education = education;
        this.name = name;
        this.description = description;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void print(PrintWriter writer) {
        writer.write(name);
    }
}
