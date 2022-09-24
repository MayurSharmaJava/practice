package function;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Supplier Will return Objects without any Input
 * .get(); method
 */
public class supplierTest {
    public static void main(String[] args) {
        Supplier<Date> date = Date::new; //--:: means Call New Method on Date Class
        System.out.println(date);//-- This Prints Supplier Interface's Implementation which is inMemory only.
        System.out.println(date.get());

        Supplier<Date> d2 = ()->new Date();//-- Using Lambda Expression
        System.out.println(d2.get());
    }
}
