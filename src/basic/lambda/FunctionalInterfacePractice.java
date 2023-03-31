package basic.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacePractice {

    public static void main(String[] args) {
        Supplier<String> helloSupplier = () -> "Hello";
        System.out.println(helloSupplier.get());

        Consumer<String> helloConsumer = (str) -> System.out.println(helloSupplier.get() + " " + str);
        helloConsumer.accept("World");

        Predicate<Integer> isPositivePredicate = (num) -> num > 0;
        if (isPositivePredicate.test(10)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        Function<Integer, String> isPositiveFunction = (num) -> {
            if (isPositivePredicate.test(num)) {
                return "positive";
            } else {
                return "negative";
            }
        };
        System.out.println(isPositiveFunction.apply(10));
    }
}
