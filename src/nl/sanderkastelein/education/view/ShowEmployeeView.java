package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.people.Employee;

/**
 * Created by human on 29/11/17.
 */
public class ShowEmployeeView extends AbstractView {

    private Employee employee;

    public ShowEmployeeView(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    public void run() {
        main:
        while (true) {
            System.out.println("Naam: " + employee.getName());
            System.out.println("Adres: " + employee.getAddress());
            System.out.println("Academy: " + employee.getAcademy().getName());


            switch (promptOptions(new String[]{
                    "Ga naar de academie",
                    "Terug"
            })) {
                case 0:
                    (new ShowAcademyView(employee.getAcademy())).run();
                    break;
                case 1:
                    break main;
            }
        }
    }
}
