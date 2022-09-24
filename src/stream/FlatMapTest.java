package stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Will create Infinite list of Random Number
 * This Stream is infinite Stream
 */
public class FlatMapTest {
    public static void main(String[] args) {
        Stream<List<Integer>> listOfInt = Stream.of(List.of(1,2,3));
        Stream<List<List<Integer>>> listOfListOfInt = Stream.of(List.of(List.of(1,2,3),List.of(5,6,7,8)));
        Stream<Stream<? extends List<? extends Object>>> listOfInt1 = Stream.of(listOfInt, listOfListOfInt);

        /* Did not Worked as Expected*/
        //listOfInt1.flatMap(l->l).forEach(System.out::println);

        Stream.of(1, 2, 3, 4).peek(System.out::println).map(s -> s+10).peek(System.out::println).forEach(s -> System.out.println("-" + s));


    }
}
