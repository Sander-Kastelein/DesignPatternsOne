package nl.sanderkastelein.education.institution.organisation;

import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.education.EducationProviderInterface;
import nl.sanderkastelein.misc.Printable;
import nl.sanderkastelein.misc.Stringable;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class School implements EducationProviderInterface, Stringable, Printable {

    private String name;

    private String description;

    private List<Education> educations;

    public School(String name, String description) {
        this.name = name;
        this.description = description;
        this.educations = new ArrayList<>();
    }

    @Override
    public List<Education> getEducations() {
        return educations;
    }

    @Override
    public void addEducation(String education) {
        this.educations.add(new Education(education));
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public void print(PrintWriter writer) {
     writer.write(getName());
    }
}
