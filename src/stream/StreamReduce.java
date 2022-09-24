package stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        Stream<Integer> intS = Stream.of(1, 2, 3);

        //Integer reduce = intS.reduce(1, Math::min);

        //Optional<Integer> reduce = intS.reduce(Math::max);

        Integer reduce = intS.reduce(1, (s, t) -> s * t ,(s, t) -> s * t);


        System.out.println("reduced to "+reduce);

    }
}
