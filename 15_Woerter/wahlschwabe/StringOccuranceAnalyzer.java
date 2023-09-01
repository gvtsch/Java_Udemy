package wahlschwabe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOccuranceAnalyzer {

    public List<StringOccurance> analyse(List<String> words){

        HashMap<String, Integer> occurances = new HashMap<>();

        for(String word : words) {
            if(occurances.containsKey(word)) {
                int n = occurances.get(word);
                occurances.put(word, n + 1);
            } else {
                occurances.put(word, 1);
            }
        }

        ArrayList<StringOccurance> list = new ArrayList<>();

        for(Map.Entry<String, Integer> e : occurances.entrySet()){
            list.add(new StringOccurance(e.getKey(), e.getValue()));
        }

        /*
        Collections.sort(list, new Comparator<StringOccurance>() {
            @Override
            public int compare(StringOccurance o1, StringOccurance o2) {
                if (o1.getOccurance() < o2.getOccurance()) {
                    return 1;
                } else if (o1.getOccurance() == o2.getOccurance()) {
                    return 0;
                } else {
                    return -1;
                }
            }    
        });
        */

        /* In Java 8 gibt es eine elegantere Lösung für obige Mehtode */
        list.sort((o1, o2) -> -Integer.compare(o1.getOccurance(), o2.getOccurance()));
        
        return list;
    }
}
