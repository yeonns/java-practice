package basic;

public class ForLoopPractice {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Basic For loop");
        for(int i=0; i<arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        System.out.println("Enhanced For loop");
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
