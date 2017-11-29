package nl.sanderkastelein;

import nl.sanderkastelein.education.institution.UniversityOfAppliedSciences;
import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.organisation.Academy;
import nl.sanderkastelein.education.institution.organisation.School;
import nl.sanderkastelein.education.view.UniversityOfAppliedSciencesView;

public class Main {

    public static void main(String[] args) {
        // load some hardcoded data

        UniversityOfAppliedSciences nhl = new UniversityOfAppliedSciences("NHL Stenden Hogeschool");

        Academy academy = new Academy(
                "Technische academie",
                "Academie voor technische dingen"
        );

        School school = new School("School of ICT", "School voor ICT");
        Education education = new Education("HBO ICT");

        education.addCourse("Design Patterns 1", "Learn about programming design patterns.");

        school.addEducation(education);
        academy.addSchool(school);
        academy.addEmployee("Henk de Jong", "Brink 1, 1000AA Amsterdam", "TA");


        nhl.addAcademy(academy);

        UniversityOfAppliedSciencesView universityOfAppliedSciencesView = new UniversityOfAppliedSciencesView(nhl);
        while(true) {
            universityOfAppliedSciencesView.run();
        }
    }
}
