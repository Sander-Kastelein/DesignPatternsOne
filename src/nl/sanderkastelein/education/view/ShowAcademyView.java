package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.organisation.Academy;

/**
 * Created by human on 29/11/17.
 */
public class ShowAcademyView extends AbstractView{

    private Academy academy;

    public ShowAcademyView(Academy academy){
        super();

        this.academy = academy;
    }


    @Override
    public void run() {
        System.out.println("Academie: " + this.academy.getName());
        System.out.println("Beschrijving " + this.academy.getDescription());
        System.out.println("Scholen onder deze academie: " + academy.getSchools().size());
        System.out.println("Opleidingen direct onder deze academie " + academy.getEducations().size());
        System.out.println("Totaal opleidingen onder deze academie " + academy.getAllEducations().size());

        switch(promptOptions(new String[]{
                "Laat scholen zien",
                "Laat opleidingen zien",
                "Terug"
        })){
            case 0:
                // List schools
                break;
            case 1:
                // List educations
                break;
        }

    }
}
