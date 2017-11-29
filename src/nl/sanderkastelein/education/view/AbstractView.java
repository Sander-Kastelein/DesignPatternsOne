package nl.sanderkastelein.education.view;

import nl.sanderkastelein.misc.Stringable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by human on 29/11/17.
 */
public abstract class AbstractView implements ViewInterface {

    protected Scanner scanner;


    protected AbstractView()
    {
        this.scanner = new Scanner(System.in);
    }


    protected int promptOptions(Object[] options) {
        System.out.println("");
        System.out.println("================================================================================");


        for(int i = 0; i < options.length; i++) {
            System.out.println("[" + (i+1) + "] " + options[i]);
        }
        System.out.println();

        while(true){
            System.out.print("Selecteer een keuze: ");

            String input = scanner.nextLine();
            try {
                int index = Integer.parseInt(input)-1;
                if(index >= 0 && index < options.length){
                    clearScreen();
                    return index;
                }
            }catch (Exception ignored){
            }
        }
    }

    protected void clearScreen() {
        for(int i = 0; i < 40; i++){
            System.out.println();
        }
    }

    protected Stringable selectStringable(List<Stringable> stringableList) {
        ArrayList<String> options = new ArrayList<>();

        for(Stringable stringable : stringableList) {
            options.add(stringable.toString());
        }
        options.add("Terug");

        int index = promptOptions(options.toArray());
        return stringableList.get(index);
    }

    public String promptString(String question){
        System.out.println(question);
        return scanner.nextLine();
    }

}
