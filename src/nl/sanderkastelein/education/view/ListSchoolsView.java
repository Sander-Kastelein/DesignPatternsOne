package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.organisation.School;
import nl.sanderkastelein.misc.Stringable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by human on 29/11/17.
 */
public class ListSchoolsView extends AbstractView{

    private List<School> schools;

    public ListSchoolsView(List<School> schools) {
        super();
        this.schools = schools;
    }


    @Override
    public void run() {
        System.out.println("Scholen:");

        for (School school : schools) {
            System.out.println("- " + school.getName());
        }

        switch (promptOptions(new String[]{"Meer informatie over een school", "Voeg een school toe", "Ga terug"})) {
            case 0:
                System.out.println("Kies een school");
                School school = (School) selectStringable(new ArrayList<Stringable>(schools));
                (new ShowSchoolView(school)).run();
                break;
            case 1:
                String name = promptString("Wat is de naam van de school?");
                String description = promptString("Wat is de omschrijving van de school?");
                School newSchool = new School(name, description);
                schools.add(newSchool);
                break;
        }
    }
}
