package function;


import java.util.ArrayList;
import java.util.List;

/**
 * The double colon (::) operator is known as the method reference in Java 8.
 * Method references are expressions that have the same treatment as a lambda expression,
 * but instead of providing a lambda body, they refer to an existing method by name.
 * This can make your code more readable and concise.
 * Read more: https://www.java67.com/2018/06/what-is-double-colon-operator-in-java-8.html#ixzz7YNURtgmi
 */
public class DoubleColonTest {
    public static int staticInstVar1 = 10;
    public static void staticMet1(String s){
        System.out.println("Static Met1 Called. - "+s);
    }
    
    public void nosStaticMet2(String s){
        System.out.println("Non Static Method2 Called. + "+s);
    }

    public static void main(String[] args) {
       //int staticInstVar1 = DoubleColonTest::staticInstVar1; //-- Only methods allowed with :: not Vaiable

        List<String> list = List.of("Mayur","Sharma");

        list.forEach(DoubleColonTest::staticMet1);
        //list.forEach(DoubleColonTest::nosStaticMet2);//--Not allowed Non static method

        DoubleColonTest dtest = new DoubleColonTest();
        list.forEach(dtest::nosStaticMet2);//--Not allowed Non static method


    }
}
