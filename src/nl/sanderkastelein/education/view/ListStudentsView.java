package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.organisation.School;
import nl.sanderkastelein.education.institution.people.Student;
import nl.sanderkastelein.misc.Stringable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by human on 29/11/17.
 */
public class ListStudentsView extends AbstractView{

    private List<Student> students;
    private Education education;

    public ListStudentsView(Education education){
        super();

        this.students = education.getStudentList();
        this.education = education;
    }
    @Override
    public void run() {
        main:
        while(true) {
            System.out.println("Studenten:");

            for (Student student : students) {
                System.out.println("- " + student.getName());
            }

            switch (promptOptions(new String[]{"Meer informatie over een student", "Voeg een student toe", "Ga terug"})) {
                case 0:
                    System.out.println("Kies een" +
                            " student");
                    Student student = (Student) selectStringable(new ArrayList<Stringable>(students));
                    (new ShowStudentView(student)).run();
                    break;
                case 1:
                    String name = promptString("Wat is de naam van de student?");
                    String address = promptString("Wat is het adres van de student?");
                    education.addStudent(name, address);
                    break;
                case 2:
                    break main;
            }
        }
    }
}
