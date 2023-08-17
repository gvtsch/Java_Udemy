import java.util.*;

public class exercise_2 {
    public void run(String input) {
        // String input existiert bereits.
        // Vervollständige das Programm, sodass zu jedem Monat die
        // korrekte Anzahl an Tagen ausgegeben wird. Verwende dazu
        // ein switch-Statement!
        
        String monat = input.toLowerCase();
        switch(monat){
            case "januar":
                System.out.println(31);
                break;
            case "februar":
                System.out.println(28);
                break;
            case "märz":
                System.out.println(31);
                break;
            case "april":
                System.out.println(30);
                break;
            case "mai":
                System.out.println(31);
                break;
            case "juni":
                System.out.println(30);
                break;
            case "juli":
                System.out.println(31);
                break;
            case "august":
                System.out.println(31);
                break;
            case "september":
                System.out.println(30);
                break;
            case "oktober":
                System.out.println(31);
                break;
            case "november":
                System.out.println(30);
                break;
            case "dezember":
                System.out.println(31);
                break;

        }
        
    }

}