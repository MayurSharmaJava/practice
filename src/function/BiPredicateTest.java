package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class BiPredicateTest {

    public static void main(String[] args) {

        BiPredicate<String,String> startsWith = (s,t)->{
            if(s.startsWith(t)){
                System.out.println(s +" starts with "+ t);
                return true;
            }else{
                return false;
            }
        };

        BiPredicate<String,String> autoStartsWith = String::startsWith;

        ArrayList<String> names = new ArrayList<>(List.of("Mayur","Sharma","Shah"));

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        names.forEach(s ->startsWith.test(s,str));

        names.forEach(s->{
            System.out.println(autoStartsWith.test(s,str));
        });



    }

}
