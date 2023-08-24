import java.util.Arrays;

public class Exercise_2 {
    public static void magic(int[][] arr){
        
        int[] sums = new int[arr.length];
        int cnt = 0;

        for (int[] a : arr) {
            int sum = 0;
            for (int b : a) {
                sum = sum + b;
            };
            sums[cnt] = sum;
            cnt ++;
        }

        boolean isMagicArray = true;
        for (int value : sums) {
            if (value != sums[0]) {
                System.out.println("Simple Array");
                isMagicArray = false;
                break;
            }
        }
        if (isMagicArray == true) {
            System.out.println("Magic Array!");
        }         
    };

    public static void main(String[] args){

        int[][] a = {
            {2, 2, 5, 2},
            {5, 5},
            {7, 2, 1}
        };
        magic(a);
    }
}


