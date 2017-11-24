package nl.sanderkastelein.education.institution;

import nl.sanderkastelein.education.institution.organisation.Academy;

import java.util.ArrayList;
import java.util.List;

public class UniversityOfAppliedSciences {

    private String name;

    private List<Academy> academyList;

    public UniversityOfAppliedSciences(String name) {
        this.name = name;
        this.academyList = new ArrayList<>();
    }

    public List<Academy> getAcademyList() {
        return academyList;
    }

    public String getName() {
        return name;
    }
}
