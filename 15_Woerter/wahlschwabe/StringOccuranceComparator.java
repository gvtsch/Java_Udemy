package wahlschwabe;
import java.util.Comparator;

public class StringOccuranceComparator implements Comparator<StringOccurance> {

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
}

/* Diese Klasse wurde mittlerweile in StringOccuranceAnalyzer händisch implementiert 
* (Methode eines fertigen Interface überschreiben) und kann
 * gelöscht werden. Der Vollständigkeit halber, lasse ich sie drin.
 */