package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorTest {

    public static void main(String[] args) {
        Stream<Integer> stm = Stream.of(1, 2, 3, 4, 5);
       // Integer collect = stm.collect(Integer::new, (s, t) -> s + t);
    }
}
