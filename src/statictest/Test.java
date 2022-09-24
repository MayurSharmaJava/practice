package statictest;

public class Test {
    public static void main(String[] args) {
        Class<?> aClass = new MyStaticClass().getClass();//-- this will cause class to load and static block to execute
        MyStaticClass.getInstance();
    }
}
