package test2June;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class test1 {

    //--The cat chases the rat but ThE rat runs away cheer to all RaTs

    public static void main(String[] args) {
        String input = "The cat chases the rat but ThE rat runs away cheer to all RaTs";
        String[] s = input.toLowerCase(Locale.ROOT).split(" ");
        Map<String,Integer> h = new HashMap();
        Arrays.stream(s).map(x -> {
            if (h.containsKey(x)) {
                int count = h.get(x)+1;
                h.put(x,count);
            } else {
                h.put(x, 1);
            }
            return h;
        }).collect(Collectors.toSet());
        System.out.println(h);

    }
}
