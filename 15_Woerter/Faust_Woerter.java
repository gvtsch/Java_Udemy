import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import wahlschwabe.StringOccurance;
import wahlschwabe.StringOccuranceAnalyzer;

public class Faust_Woerter {

    public static void main(String[] args) {
        String fileName = "F:\\Java_Udemy\\15_Woerter\\faust.txt";
        ArrayList<String> words = new ArrayList<>();

        Scanner input; 
        try {
            input = new Scanner(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("Es ist ein Fehler aufgetreten. Datei nicht lesbar.");
            return;
        }

        while (input.hasNext()) {
            words.add(input.next());
            // System.out.println(input.next());
        }

        StringOccuranceAnalyzer stringOccuranceAnalyzer = new StringOccuranceAnalyzer();
        List<StringOccurance> occurances = stringOccuranceAnalyzer.analyse(words);
        int cnt = 0;
        for(StringOccurance item : occurances){
            cnt++;
            if(cnt == 25) {
                break;
            }
            System.out.println(item.getWord() + ": " + item.getOccurance());
        }
    }

}
