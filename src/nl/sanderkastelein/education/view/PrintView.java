package nl.sanderkastelein.education.view;

import nl.sanderkastelein.education.institution.UniversityOfAppliedSciences;
import nl.sanderkastelein.education.institution.education.Education;
import nl.sanderkastelein.education.institution.organisation.Academy;
import nl.sanderkastelein.education.institution.organisation.School;
import nl.sanderkastelein.education.institution.people.Employee;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by human on 01/12/17.
 */
public class PrintView extends AbstractView {

    private UniversityOfAppliedSciences universityOfAppliedSciences;

    public PrintView(UniversityOfAppliedSciences universityOfAppliedSciences) {
        this.universityOfAppliedSciences = universityOfAppliedSciences;
    }

    @Override
    public void run(){
        try {
            String location = promptString("Kies een locatie");
            PrintWriter writer = new PrintWriter(location, "UTF-8");


        for(Academy academy : universityOfAppliedSciences.getAcademyList()){
            writer.println("|---------------------------------------------------------------------|");
            writer.print("| ");
            academy.print(writer);
            writer.println(" |");

            writer.println("| Schools: |");

            for(School school : academy.getSchools()){
                writer.write("| -");
                school.print(writer);
                writer.println(" |");
            }

            writer.println("| Opleidingen: |");

            for(Education education: academy.getAllEducations()){
                writer.write("| -");
                education.print(writer);
                writer.println(" |");
            }


            writer.println("| Medewerkers: |");

            for(Employee employee: academy.getEmployeeList()){
                writer.write("| -");
                employee.print(writer);
                writer.println(" |");
            }

            writer.println("|---------------------------------------------------------------------|");
        }
        writer.flush();
            writer.close();

        }catch(Exception e){
            System.out.println("Oeps file kon niet worden geopend");
        }


    }
}
