package algo.linkedlist.doubly;

public class DoublyNode {
    private int value;
    private DoublyNode next;
    private DoublyNode prev;

    public DoublyNode(int value) {
        this.value = value;
    }

    public DoublyNode(int value, DoublyNode prev, DoublyNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }
}
