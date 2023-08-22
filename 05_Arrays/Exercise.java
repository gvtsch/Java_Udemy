public class Exercise {
    
    public static void max(int[] arr) {
        // Schreibe den Code hier
        int maxItem = 0;
        for(int num : arr) {
            if (num > maxItem) {
                maxItem = num;
            }
        }
        System.out.println(maxItem);
        
    }

    public static void main(String[] args) {
        int[] a = {13, 25, 0, 44};
        max(a);
    }
}
