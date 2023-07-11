package algo.linkedlist.singly;

public class TestLL {
    public static void main(String[] args) {
        TestLL testLL = new TestLL();
        testLL.test();
    }

    private void test() {
        LL ll = new LL();


        ll.insertAtHead(5);
        ll.insertAtHead(6);
        ll.insertAtHead(7);
        ll.insertAtHead(8);
        ll.insertAtTail(4);
        ll.insertAtTail(2);
        ll.insertAtTail(1);
        ll.insertAtTail(0);

        ll.insert(100, 2);
        ll.insert(200, 4);

        System.out.println(ll);

        System.out.println(ll.delete(4));
        System.out.println(ll);

        System.out.println(ll.delete(8));
        System.out.println(ll);

        System.out.println("size = "+ll.getSize());

    }
}
