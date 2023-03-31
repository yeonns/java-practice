package basic.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("John", "Charlie", "Tom"));
        names.forEach(name -> System.out.printf("Hello, %s\n", name));
        // Practice: Single Parameter Lambda Expression

        Map<String, Integer> nameAndAge = new HashMap<>(){{
           put("John", 5);
           put("Charlie", 3);
           put("Tom", 4);
        }};

        for(String key : nameAndAge.keySet()) {
            System.out.printf("%s is %d years old\n", key, nameAndAge.get(key));
        }
        // Practice: Multiple Parameter Lambda Expression
     }
}
