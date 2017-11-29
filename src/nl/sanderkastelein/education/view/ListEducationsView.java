package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.misc.Stringable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by human on 29/11/17.
 */
public class ListEducationsView extends AbstractView {

    private List<Education> educationList;

    public ListEducationsView(List<Education> educationList) {
        super();
        this.educationList = educationList;
    }


    @Override
    public void run() {
        System.out.println("Opleidingen:");

        for (Education education : educationList) {
            System.out.println("- " + education.getName());
        }

        switch (promptOptions(new String[]{"Meer informatie over een opleiding", "Voeg een opleiding toe", "Ga terug"})) {
            case 0:
                System.out.println("Kies een opleiding");
                Education education = (Education) selectStringable(new ArrayList<Stringable>(educationList));
                (new ShowEducationView(education)).run();
                break;
            case 1:
                String name = promptString("Wat is de naam van de opleiding?");
                Education newEducation = new Education(name);
                educationList.add(newEducation);
                break;
        }
    }
}
