package basic;

public class VarArgsPractice {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // Error occurs!
        //printArray(1, 2, 3);
        printArray(arr);
        System.out.println();
        printArrayWithVarArgs(1, 2, 3);
        System.out.println();
        printArrayWithVarArgs(arr);
        System.out.println();
        System.out.println(String.format("String.format is %s %s", "varargs", "function"));
        System.out.println(String.join(" ", "String.join is", "varargs", "function"));
    }

    private static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
    }

    private static void printArrayWithVarArgs(int... arr) {
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
