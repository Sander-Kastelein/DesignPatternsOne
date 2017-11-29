package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.education.Education;

/**
 * Created by human on 29/11/17.
 */
public class ShowEducationView extends AbstractView {
    private Education education;

    public ShowEducationView(Education education) {
        super();

        this.education = education;
    }

    @Override
    public void run() {

    }
}
