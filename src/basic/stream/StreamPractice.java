package basic.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> items = Arrays.asList(
            "A12", "a20", "A05",
            "B04", "b02", "b09",
            "C20", "c33", "C08"
        );

        System.out.println("[Without Stream]");
        List<String> filteredItems = new ArrayList<>();
        items.forEach(item -> {
            if (item.toUpperCase().startsWith("C")) {
                filteredItems.add(item.toUpperCase());
            }
        });
        filteredItems.sort(Comparator.naturalOrder());
        filteredItems.forEach(System.out::println);

        System.out.println("[With Stream]");
        // stream을 사용해서 filteredItems와 같은 결과를 출력하기
    }
}
