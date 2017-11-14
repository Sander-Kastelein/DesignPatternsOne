package nl.sanderkastelein.education.institution.organisation;

import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.education.EducationProviderInterface;

import java.util.ArrayList;
import java.util.List;

public class Academy implements EducationProviderInterface {

    private String name;

    private String description;

    private List<School> schools;

    private List<Education> educations;

    public Academy(String name, String description, List<School> schools, List<Education> educations) {
           this.name = name;
           this.description = description;
           this.schools = schools;
           this.educations = educations;
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
    public void addEducation(Education education) {
        this.educations.add(education);
    }

    public void addSchool(School school) {
        this.schools.add(school);
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
