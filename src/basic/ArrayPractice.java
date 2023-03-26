package basic;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr = initArray(10);

        System.out.printf("arr is %s\n", Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.printf("sorted arr is %s\n", Arrays.toString(arr));
    }

    private static int[] initArray(int len) {
        Random random = new Random(123);
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
