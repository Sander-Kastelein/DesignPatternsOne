package nl.sanderkastelein.education.institution.education;

import java.util.List;

public interface EducationProviderInterface {
    List<Education> getEducations();
    void addEducation(Education education);
}
