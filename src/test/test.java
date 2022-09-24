/*
package test;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    //{{1,2,3}{6,2,4}{5,9,1}}
    //-- sorting
    //-- Sum & sort {6,{{1,2,3}{2,4,0}} }//--
    public static void main(String[] args) {
        ArrayList<Set> input = new ArrayList<>();
        Set<Integer> set1 = Set.of(5,2,3);
        Set<Integer> set2 = Set.of(4,5,3);
        Set<Integer> set3 = Set.of(7,2,31);
        //Set<Integer> set4 = Stream.of(1,2,3).collect(Collectors.toSet());
        input.add(set1);
        input.add(set2);
        input.add(set3);

        */
/*Map<Integer, Set> collect = input.stream().map(x -> {
            Set<Integer> sorted = new TreeSet();
            sorted.addAll(x);
            return sorted;
        }).collect(Collectors.toMap(x -> {
            return x.stream().reduce(0, Integer::sum);
        }, y -> {
            return y;
        }));


        System.out.println(collect);*//*

        System.out.println(input);
        List<Object> collect = input.stream().map((Set x) -> {
           return x.stream().sorted().collect(Collectors.toSet());
        }).collect(Collectors.toList());

        System.out.println(collect);

        input.stream().forEach(x->{
            x.stream().reduce(0,Integer::sum);
        });
    }
}
*/
