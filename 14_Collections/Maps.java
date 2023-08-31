import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Müller", "+491234567890");
        phoneBook.put("Müller", "+491234567894");
        phoneBook.put("Schmidt", "+490987654321");

        System.out.println(phoneBook.containsKey("Müller"));
        System.out.println(phoneBook.get("Müller"));
        System.out.println(phoneBook.containsKey("Kempkes"));

        for (Map.Entry<String, String> e : phoneBook.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        // phoneBook.remove();

    }
}
