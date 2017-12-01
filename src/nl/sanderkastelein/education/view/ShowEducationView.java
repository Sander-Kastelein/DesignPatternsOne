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
        main:
        while(true) {
            System.out.println("Opleiding: " + education.getName());
            System.out.println("Aantal vakken bij deze opleiding " + education.getCourseList().size());
            System.out.println("Aantal studenten bij deze opleiding " + education.getStudentList().size());

            switch (promptOptions(new String[]{
                    "Laat vakken zien",
                    "Laat studenten zien",
                    "Terug"
            })) {
                case 0:
                    (new ListCoursesView(education)).run();
                    break;
                case 1:
                    (new ListStudentsView(education)).run();
                    break;
                case 2:
                    break main;
            }
        }

    }
}
