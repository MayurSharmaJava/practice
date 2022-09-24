package function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<String,Integer,String> repeator = (s,t) -> {
            String str="";
            int i = 0;
            while(i<t){
                str+=s;
                i++;
            }
            //System.out.println(str);
            return str;
        };

        Map<String,Integer> map = new HashMap(Map.of("mayur",2,"Sharma",3));

        map.forEach(repeator::apply); //-- Appply but not print

        map.forEach((s,t)->System.out.println(repeator.apply(s,t))); //-- apply and print
    }
}
