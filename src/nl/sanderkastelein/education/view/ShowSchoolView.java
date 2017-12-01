package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.organisation.School;

import java.util.List;

/**
 * Created by human on 29/11/17.
 */
public class ShowSchoolView extends AbstractView {

    private School school;

    public ShowSchoolView(School school) {
        this.school = school;
    }

    @Override
    public void run() {
        main:
        while(true) {
            System.out.println("School naam: " + school.getName());
            System.out.println("Omschrijving: " + school.getDescription());
            System.out.println("Hoeveelheid opleidingen: " + school.getEducations().size());


            switch (promptOptions(new String[]{
                    "Laat opleidingen",
                    "Terug"
            })) {
                case 0:
                    (new ListEducationsView(school)).run();
                    break;
                case 1:
                    break main;
            }

        }
    }
}
