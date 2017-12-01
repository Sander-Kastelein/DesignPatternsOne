package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.UniversityOfAppliedSciences;


public class UniversityOfAppliedSciencesView extends AbstractView {


    private UniversityOfAppliedSciences universityOfAppliedSciences;

    public UniversityOfAppliedSciencesView(UniversityOfAppliedSciences universityOfAppliedSciences) {
        this.universityOfAppliedSciences = universityOfAppliedSciences;
    }

    @Override
    public void run() {
        main:
        while(true) {
            System.out.println("Welkom bij de interface voor " + universityOfAppliedSciences.getName());
            switch (promptOptions(new String[]{"Laat alle academies zien", "Print", "Exit"})) {
                case 0:
                    (new ListAcademiesView(universityOfAppliedSciences.getAcademyList())).run();
                    break;
                case 1:
                    (new PrintView(universityOfAppliedSciences)).run();

                    break;
                case 2:
                    break main;
            }
        }
    }


}
