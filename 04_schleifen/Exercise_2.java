public class Exercise_2 {
    public void main(int N) {
        // Ergänze den Code hier! Variable int N existiert bereits.
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            else {
                continue;
            }
        }

        int i = 1;
        while (i <= N){
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
            else {
                i++;
                continue;
            }
        }
    }
}
