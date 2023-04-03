package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayPractice {

    public static void main(String[] args) {
        Integer[] arr = initArray(10);

        System.out.printf("arr is %s\n", Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.printf("sorted arr is %s\n", Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf("reverse sorted arr is %s\n", Arrays.toString(arr));
    }

    private static Integer[] initArray(int len) {
        Random random = new Random(123);
        Integer[] arr = new Integer[10];
        for(int i=0; i<len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
