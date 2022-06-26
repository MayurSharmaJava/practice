package practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExercise {
    public static void main(String[] args) {
        List<Person> pl = new ArrayList<>();
        pl.add(new Person("Mayur","Sharma",36));
        pl.add(new Person("Neha","Sharma",33));
        pl.add(new Person("Prisha","Sharma",1));

        Function<Person,String> westernName = p -> {
            return p.firstname+" "+p.lastname;
        };

        Function<Person,String> easternName = p -> {
            return p.lastname+" "+p.firstname;
        };

        for(Person p:pl){
            p.printCustomName(easternName);
        }
    }
}
