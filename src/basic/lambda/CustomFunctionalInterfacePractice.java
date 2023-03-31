package basic.lambda;

@FunctionalInterface
interface Printer {
    void print(String str);
}

// 두 숫자를 parameter로 가지고, 두 숫자와 같은 type을 return하는
// functional interface Calculator를 작성해보자
// Calculator는 operate라는 method를 가진다

public class CustomFunctionalInterfacePractice {

    public static void main(String[] args) {
        Printer p = (s) -> System.out.println("Hello, " + s);
        p.print("John");

/*
        Printer<String> p = (s) -> System.out.println("Hello, " + s);
        p.print("John");
*/

/*
        Calculator<Integer> c = (a, b) -> a + b;
        Integer result = c.operate(4, 5);
        isCalculatorCorrect(result);
*/
    }

    public static void isCalculatorCorrect(Integer result) {
        if (result == 9) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }
}
