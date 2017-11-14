package nl.sanderkastelein.education.institution.organisation;

import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.education.EducationProviderInterface;

import java.util.List;

public class School implements EducationProviderInterface {

    private String name;

    private String description;

    private List<Education> educations;

    public School(String name, String description, List<Education> educations) {
        this.name = name;
        this.description = description;
        this.educations = educations;
    }

    @Override
    public List<Education> getEducations() {
        return educations;
    }

    @Override
    public void addEducation(Education education) {
        this.educations.add(education);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
