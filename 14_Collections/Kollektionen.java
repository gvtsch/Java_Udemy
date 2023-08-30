import wahlschwabe.DiaryEntry;
import wahlschwabe.HideMessage;

public class Kollektionen {
    public static void main(String[] args) {

        HideMessage<DiaryEntry> h = new HideMessage<>(new DiaryEntry());
        DiaryEntry result = h.getMessage("test");

        HideMessage<String> h2 = new HideMessage<>("Hallo Welt");
        String result2 = h2.getMessage("test");

        System.out.println(result);
        System.out.println(result2);

    }
}
