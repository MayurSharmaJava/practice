package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate takes One param and run Test function on it and Return True Or False
 * One param input Boolean Output
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> startingWith = String::isEmpty;

        Predicate<String> startingWith2 = s->{
            if(s.isEmpty()) {
                System.out.println("Empty!");
                return true;
            }
            else{
                System.out.println(s);
            }
            return false;
        };

        ArrayList<String> blankStr = new ArrayList<>(List.of("","mayur","","","","Sharma"));

        blankStr.forEach(s->startingWith2.test(s));

        blankStr.forEach(startingWith2::test);

        System.out.println(startingWith2.test(""));
    }
}
