package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.UniversityOfAppliedSciences;

public class UniversityOfAppliedSciencesView implements ViewInterface {

    private UniversityOfAppliedSciences universityOfAppliedSciences;

    public UniversityOfAppliedSciencesView(UniversityOfAppliedSciences universityOfAppliedSciences) {

        this.universityOfAppliedSciences = universityOfAppliedSciences;
    }

    @Override
    public String render() {
        return "Hello " + universityOfAppliedSciences.getName();
    }
}
