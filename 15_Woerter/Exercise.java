import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exercise {
    
    /* Schreibe ein Programm, das zu jedem WOrt der Eingabe die Häufigkeit ermittelt.
     */

    public static Map<String, Integer> run(List<String> words) {
        Map<String, Integer> m = new HashMap<>();
        for (String word : words) {
            if(m.containsKey(word)) {
                int c = m.get(word);
                m.put(word, c+1);
            } else {
                m.put(word, 1);
            }
        }
        return m;
    }

    public static void main(String[] args){
        LinkedList<String> words = new LinkedList<>();
        words.add("Hallo");
        words.add("Hallo");
        words.add("Welt");
        words.add("Party");

        Map<String, Integer> results = run(words);

        for(Map.Entry<String, Integer> i : results.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
