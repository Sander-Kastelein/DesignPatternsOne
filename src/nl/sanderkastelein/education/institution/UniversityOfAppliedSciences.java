package nl.sanderkastelein.education.institution;

import nl.sanderkastelein.education.institution.organisation.Academy;

import java.util.List;

public class UniversityOfAppliedSciences {

    private String name;

    private List<Academy> academyList;

    public UniversityOfAppliedSciences(String name, List<Academy> academyList) {
        this.name = name;
        this.academyList = academyList;
    }

    public List<Academy> getAcademyList() {
        return academyList;
    }

    public String getName() {
        return name;
    }
}
