package basic;

import java.util.List;

public class AutoBoxingAndUnBoxingPractice {

    private static void boxingIntegerExample() {
        Integer deprecatedBoxingInt = new Integer(15);
        Integer boxingInt = Integer.valueOf(10);    // unnecessary

        Integer autoBoxingInt = 10;

        int unBoxingInt = autoBoxingInt.intValue();     // unnecessary
        int autoUnBoxingInt = autoBoxingInt;
    }

    private static void boxingListExample() {
        List<Integer> boxingIntegerList = List.of(1, 2, 3);
        System.out.printf("Class of boxingIntegerList's item: %s\n", boxingIntegerList.get(0).getClass().getName());
    }

    public static void main(String[] args) {
        boxingListExample();
    }
}
