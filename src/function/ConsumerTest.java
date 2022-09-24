package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Consumer Consumes Object but Do not return anything
 * .accept(s); method called
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> sConsumer = (s)-> System.out.println("Consuming "+s);

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Mayur","Sharma"));

        name.forEach(s -> sConsumer.accept(s));
        name.forEach((s)->{sConsumer.accept(s);});

        name.forEach(sConsumer::accept);

        name.stream().forEach(sConsumer::accept);
    }
}
