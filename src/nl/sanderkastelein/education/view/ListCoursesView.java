package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.education.Course;
import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.misc.Stringable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by human on 29/11/17.
 */
public class ListCoursesView extends AbstractView {

    private Education education;

    public ListCoursesView(Education education) {
        super();
        this.education = education;
    }

    @Override
    public void run() {
        main:
        while (true) {
            System.out.println("Vakken:");

            for (Course course : education.getCourseList()) {
                System.out.println("- " + course.getName());
            }

            switch (promptOptions(new String[]{"Meer informatie over een vak", "Voeg een vak toe", "Ga terug"})) {
                case 0:
                    System.out.println("Kies een vak");
                    Course course = (Course) selectStringable(new ArrayList<Stringable>(education.getCourseList()));
                    (new ShowCourseView(course)).run();
                    break;
                case 1:
                    String name = promptString("Wat is de naam van het vak?");
                    String description = promptString("Wat is de omschrijving van het vak?");
                    education.addCourse(name, description);
                    break;
                case 2:
                    break main;
            }
        }
    }
}
