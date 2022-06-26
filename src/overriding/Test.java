package overriding;

public class Test {

    public static void main(String[] args) {
        //-- parent Obj
        Parent parent = new Parent();
        parent.method1();
        //c1.method2();//-- Not present

        //--Child Obj
        Child child = new Child();
        child.method1();
        child.method2();

        //Child acting as parent
        Parent childAsParent = new Child();
        childAsParent.method1();
        //childAsParent.method2();//--Not Present

        //--parent try to act as Child
        Child parentAsChild = (Child) new Parent();//--java.lang.ClassCastException as method 2 is not in Parent Object
        parentAsChild.method1();
        parentAsChild.method2();

    }
}
