    import java.util.List;
    import java.util.TreeSet;
    
    public class Exercise {
        public void run(List<String> words) {
            TreeSet<String> s = new TreeSet<>();
            
            for(String word : words) {
                if (s.contains(word)) {
                    continue;
                }
                s.add(word);
                System.out.println(word);
            }
            
        }
    }