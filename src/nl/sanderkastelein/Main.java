package nl.sanderkastelein;

import nl.sanderkastelein.education.institution.UniversityOfAppliedSciences;
import nl.sanderkastelein.education.institution.education.Course;
import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.organisation.Academy;
import nl.sanderkastelein.education.institution.organisation.School;
import nl.sanderkastelein.education.view.UniversityOfAppliedSciencesView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // load some hardcoded data

        ArrayList<Academy> academies = new ArrayList<>();

        ArrayList<School> schoolList = new ArrayList<School>();
        List<Education> educationList = new ArrayList<Education>();
        List<Course> courseList = new ArrayList<Course>();

        educationList.add(new Education("ICT"));
        schoolList.add(new School("School of ICT", "School voor ICT"));

        Academy academy = new Academy(
                "Technische academie",
                "Academie voor technische dingen",
                schoolList,
                educationList
        );

        UniversityOfAppliedSciences nhl = new UniversityOfAppliedSciences("NHL Stenden Hogeschool");

        System.out.print((new UniversityOfAppliedSciencesView(nhl)).render());
    }
}
