package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Takes One Argument and Apply Function on it and Returns R Object
 * .apply() method to be called.
 */
public class functionTest {

    public static void main(String[] args) {

        Function<String,String> trimmer = String::trim;
        Function<String,String> trimmer2 = (s)->{
            return s.trim();
        };

        ArrayList<String> names = new ArrayList<>(List.of("Mayur  ","  Sharma"));
        names.forEach(s-> System.out.println("|"+trimmer.apply(s)+"|"));
        names.forEach(s-> System.out.println("|"+trimmer2.apply(s)+"|"));
    }

}
