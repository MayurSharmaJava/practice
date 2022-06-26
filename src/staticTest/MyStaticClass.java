package practice.staticTest;

public class MyStaticClass {

    public static void main(String[] args) {
        System.out.println("PSVM");
    }

    static{
        System.out.println("Static Block");
    }

    static MyStaticClass getInstance(){
        System.out.println("Static block executed");
        return new MyStaticClass();
    }
}
