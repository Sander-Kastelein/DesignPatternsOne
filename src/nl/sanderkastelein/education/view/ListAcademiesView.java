package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.organisation.Academy;
import nl.sanderkastelein.misc.Stringable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by human on 29/11/17.
 */
public class ListAcademiesView extends AbstractView{

    private List<Academy> academies;

    public ListAcademiesView(List<Academy> academies){
        super();
        this.academies = academies;
    }

    @Override
    public void run() {
        System.out.println("Academies:");

        for(Academy academy: academies) {
            System.out.println("- " + academy.getName());
        }

        switch(promptOptions(new String[] {"Meer informatie over een academie", "Voeg een academie toe", "Ga terug"})){
            case 0:
                System.out.println("Kies een academie");
                Academy academy = (Academy)selectStringable(new ArrayList<Stringable>(academies));
                (new ShowAcademyView(academy)).run();
                break;
            case 1:
                String name = promptString("Wat is de naam van de academie?");
                String description = promptString("Wat is de beschrijving van " + name + "?");
                Academy newAcademy = new Academy(name, description);
                academies.add(newAcademy);
                break;
        }

    }


}


