package basic;

public class StringPractice {

    public static void main(String[] args) {
        String helloWorld = "Hello World!";
        String trimHelloWorld = " Hello World! ";

        System.out.println("\n[charAt]");
        System.out.println("charAt(0) is : " + helloWorld.charAt(0));
        System.out.println("charAt(lastIndex) is : " + helloWorld.charAt(helloWorld.length() - 1));

        System.out.println("\n[split]");
        System.out.println("split string with space: " + helloWorld.split(" ")[0]);
        System.out.println("split string with space: " + helloWorld.split(" ")[1]);

        System.out.println("\n[substring]");
        System.out.println("substring(0, 5): " + helloWorld.substring(0, 5));
        System.out.println("substring(0, lastIndex): " + helloWorld.substring(0, helloWorld.length() - 1));
        System.out.println("substring(0, length): " + helloWorld.substring(0, helloWorld.length()));
        System.out.println("substring(0) is same with string: " + helloWorld.substring(0));
        System.out.println("substring(length) is empty: " + helloWorld.substring(helloWorld.length()));
        // Error occurs
        //System.out.println("substring(length+1): " + helloWorld.substring(helloWorld.length() + 1));

        System.out.println("\n[contains]");
        System.out.println("Does string contain hello?: " + helloWorld.contains("Hello"));

        System.out.println("\n[trim]");
        System.out.println("trim only removes leading and trailing space: " + helloWorld.trim());
        System.out.println("trim only removes leading and trailing space: " + trimHelloWorld.trim());

        System.out.println("\n[indexOf]");
        System.out.println("find W's index: " + helloWorld.indexOf("W"));
        System.out.println("find Z's index: " + helloWorld.indexOf("Z"));
    }
}
