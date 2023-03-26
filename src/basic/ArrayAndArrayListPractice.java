package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayListPractice {

    private String[] array;
    private ArrayList<String> arrayList;

    public ArrayAndArrayListPractice() {
        System.out.println("Initialize Array and ArrayList");
        array = new String[] { "hello", "world" };
        arrayList = new ArrayList<>(List.of("hello", "world"));
    }

    private void getSize() {
        System.out.printf("Size of Array: %d\n", array.length);
        System.out.printf("Size of ArrayList: %d\n", arrayList.size());
    }

    private void setItem(int index, String item) {
        array[index] = item;
        arrayList.set(index, item);
    }

    private void getItem(int index) {
        System.out.printf("Array: %s\n", array[index]);
        System.out.printf("ArrayList: %s\n", arrayList.get(index));
    }

    private void sort() {
        Arrays.sort(array);
        arrayList.sort(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        ArrayAndArrayListPractice practice = new ArrayAndArrayListPractice();
        practice.getSize();
        practice.setItem(0, "Hello");
        practice.getItem(0);
        practice.sort();
    }
}
