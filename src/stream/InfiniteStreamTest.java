package stream;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Will create Infinite list of Random Number
 * This Stream is infinite Stream
 */
public class InfiniteStreamTest {
    public static void main(String[] args) {
        Stream<Double> random = Stream.generate(Math::random).limit(2);
        List<Long> collect = random.map(a -> a*10 )
                            .map(Math::round)
                            .collect(Collectors.toList());

        collect.stream().forEach(System.out::println);

        System.out.println(collect.stream().min((s1,s2)-> (int) (s1-s2)));

        Optional<Long> reduce = collect.stream().reduce((t, u) -> t + u);
        System.out.println("Sum of all Elements = "+reduce.orElse(0L));

        Predicate<Long> evenNo = t -> t%2==0;
        Predicate<Long> divBy1 = t -> t%1==0;
        Optional<Long> any = collect.stream().findAny();
        Optional<Long> first = collect.stream().findFirst();
        System.out.println(any.get());
        System.out.println(first.get());

        boolean allMatch = collect.stream().allMatch(divBy1);
        boolean anyOneMatched = collect.stream().anyMatch(evenNo);
        boolean nonMatched = collect.stream().noneMatch(evenNo);
        System.out.println("is all element DivBy One="+allMatch);
        System.out.println("is any One Element is Even="+anyOneMatched);
        System.out.println("is non of Element is Even="+nonMatched);

        Stream.generate(Math::random)
                .map(a -> a*100)
                .map(Math::round)
                .distinct().forEach(System.out::println);
    }
}
