package function;

import java.util.function.Function;

public class Person {
    String firstname;
    String lastname;
    int age;

    /**
     *  Function<T, R>
     <T> – the type of the input to the function
     <R> – the type of the result of the function
     */
    public void printCustomName(Function<Person,String> f){
        System.out.println(f.apply(this)); /** Applies this function to the given argument. **/
    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

}
