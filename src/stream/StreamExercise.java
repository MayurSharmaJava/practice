package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamExercise {
    public static void main(String[] args) {
        List<Float> number = Arrays.asList(1f,2f,3f,4f,5f);

        Predicate<Float> filterLessThen3 = x -> x <= 3.0;
        List<Float> collect = number.stream().filter(filterLessThen3).collect(Collectors.toList());

        List<Float> collectDiv2 = number.stream().map(x -> x / 2).collect(Collectors.toList());

        StreamExercise s= new StreamExercise();
        System.out.println(collect);
        System.out.println(collectDiv2);

        long res = LongStream.of(2, 3,4)
                .reduce(2, (acc, next) -> acc * next);
        System.out.println("sequencial Output = "+res);

        long resParallel = LongStream.of(2,3,4)
                .parallel() //<--- stream is parallel now
                .reduce(2, (acc, next) -> acc * next);
        System.out.println("parallel Output = "+resParallel);
    }

    public void sysout(float x){
        System.out.println("-"+x);
    }
}
