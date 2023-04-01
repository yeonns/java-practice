package basic.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class GenerateStreamPractice {
    public static void main(String[] args) {
        String[] alphabetArray = { "a", "b", "c" };
        List<String> alphabetList = Arrays.asList("d", "e", "f");

        // Array에서 stream 생성
        Stream<String> arrayStream = Arrays.stream(alphabetArray);
        // 병렬처리가 가능한 stream 생성
        Stream<String> arrayParallelStream = Arrays.stream(alphabetArray).parallel();

        // List에서 stream 생성
        Stream<String> collectionStream = alphabetList.stream();
        // 병렬처리가 가능한 stream 생성
        Stream<String> collectionParallelStream = alphabetList.parallelStream();

        // stream 붙이기
        Stream<String> concatStream = Stream.concat(arrayStream, collectionStream);
        concatStream
            .filter(item -> item.contains("a") || item.contains("e"))
            .map(String::toUpperCase)
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }
}
