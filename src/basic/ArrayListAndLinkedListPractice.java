package basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListPractice {

    private ArrayList<String> arrayList;
    private LinkedList<String> linkedList;

    public ArrayListAndLinkedListPractice() {
        arrayList = new ArrayList<>(List.of("hello", "world"));
        linkedList = new LinkedList<>(List.of("hello", "world"));
    }

    private void getSize() {
        System.out.printf("Size of ArrayList: %d\n", arrayList.size());
        System.out.printf("Size of LinkedList: %d\n", linkedList.size());
    }

    private void setItem(int index, String item) {
        arrayList.set(index, item);
        linkedList.set(index, item);
    }

    private void getItem(int index) {
        System.out.printf("ArrayList: %s\n", arrayList.get(index));
        System.out.printf("LinkedList: %s\n", linkedList.get(index));
    }

    private void sort() {
        arrayList.sort(Comparator.naturalOrder());
        linkedList.sort(Comparator.reverseOrder());
    }

    private void addItem(int index, String item) {
        arrayList.add(index, item);
        linkedList.add(index, item);
    }

    private void printList() {
        System.out.printf("ArrayList: %s\n", arrayList.toString());
        System.out.printf("LinkedList: %s\n", linkedList.toString());
    }

    public static void main(String[] args) {
        ArrayListAndLinkedListPractice practice = new ArrayListAndLinkedListPractice();
        practice.getSize();
        practice.addItem(1, "!");
        practice.printList();
    }
}
