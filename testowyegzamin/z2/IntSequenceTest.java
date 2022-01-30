package pl.edu.uwm.gkrych.testowyegzamin.z2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntSequenceTest {
    public static void main(String[] args) {
        System.out.println("zad 2.a)");
        Stream<Integer> intSequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        intSequence.limit(10).forEach(System.out::println);

        System.out.println("zad 2.b)");
        Stream<Integer> intSequenceStream = IntSequence.squares(3);
        intSequenceStream.limit(5).forEach(System.out::println);
    }
}
