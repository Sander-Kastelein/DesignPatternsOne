package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.organisation.Academy;
import nl.sanderkastelein.education.institution.organisation.School;
import nl.sanderkastelein.education.institution.people.Employee;
import nl.sanderkastelein.misc.Stringable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by human on 29/11/17.
 */
public class ListEmployeesView extends AbstractView{

    private List<Employee> employeeList;
    private Academy academy;

    public ListEmployeesView(Academy academy){
        super();
        this.academy = academy;
        this.employeeList = academy.getEmployeeList();
    }

    @Override
    public void run() {
        main:
        while(true) {
            System.out.println("Medewerkers:");

            for (Employee employee : employeeList) {
                System.out.println("- " + employee.getName());
            }

            switch (promptOptions(new String[]{"Meer informatie over een medewerker", "Voeg een medewerker toe", "Ga terug"})) {
                case 0:
                    System.out.println("Kies een medewerker");
                    Employee employee = (Employee) selectStringable(new ArrayList<Stringable>(employeeList));
                    (new ShowEmployeeView(employee)).run();
                    break;
                case 1:
                    String name = promptString("Wat is de naam van de medewerker?");
                    String address = promptString("Wat is het adres van de medewerker?");
                    String jobTitle = promptString("Wat is de functie van de medewerker?");
                    Employee newEmployee = new Employee(this.academy, name, address, jobTitle);

                    employeeList.add(newEmployee);
                    break;
                case 2:
                    break main;
            }
        }
    }
}
