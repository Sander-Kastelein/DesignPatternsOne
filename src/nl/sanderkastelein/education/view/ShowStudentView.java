package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.education.Course;
import nl.sanderkastelein.education.institution.people.Student;

/**
 * Created by human on 01/12/17.
 */
public class ShowStudentView extends AbstractView {

    private Student student;

    public ShowStudentView(Student student) {
        super();
        this.student = student;
    }

    @Override
    public void run() {
        main:
        while(true) {
            System.out.println("Naam: " + student.getName());
            System.out.println("Adres: " + student.getAddress());
            System.out.println("Opleiding: " + student.getEducation().getName());
            System.out.println("Studiepunten: " + student.getPoints());

            System.out.println("Vakken:");
            for (Course course : student.getEducation().getCourseList()) {
                System.out.println("- " + course.getName());
            }

            switch (promptOptions(new String[]{
                    "Ga naar de opleiding",
                    "Terug"
            })) {
                case 0:
                    (new ShowEducationView(student.getEducation())).run();
                    break;
                case 1:
                    break main;
            }
        }

    }
}
