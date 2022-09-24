package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * BiConsumer Consumes Two Object but Do not return anything
 * .accept(s,t); method called
 */
public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer = (s, t)-> System.out.println("Consuming :"+s+"-"+t);

        Map<String,Integer> nameAgeMap = new HashMap<>(Map.of("mayur",10,"Sharma",20));

        //-- Style 1 .
        nameAgeMap.forEach(biConsumer::accept);

        nameAgeMap.forEach((s,t)->biConsumer.accept(s,t));

        nameAgeMap.forEach((s,t)->{
            biConsumer.accept(s,t);
        });


    }
}
