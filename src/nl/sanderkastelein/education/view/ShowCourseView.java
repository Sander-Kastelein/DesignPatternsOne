package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.education.Course;

/**
 * Created by human on 01/12/17.
 */
public class ShowCourseView extends AbstractView {
    private Course course;

    public ShowCourseView(Course course) {
        this.course = course;
    }

    @Override
    public void run() {

        main:
        while(true) {
            System.out.println("Naam: " + course.getName());
            System.out.println("Beschrijving: " + course.getDescription());
            System.out.println("Opleiding: " + course.getEducation().getName());

            switch (promptOptions(new String[]{
                    "Ga naar de opleiding",
                    "Terug"
            })) {
                case 0:
                    (new ShowEducationView(course.getEducation())).run();
                    break;
                case 1:
                    break main;
            }
        }

    }
}
