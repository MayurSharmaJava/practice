package algo.linkedlist.singly;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int val){
        Node node = new Node(val);

        if(this.head==null){
            this.head = node; //-- 1st insert
            this.tail = node;
        }else{
            node.setNext(this.head);
            this.head = node;
        }

        size += 1;
    }

    public void insertAtTail(int val){
        Node node = new Node(val);
       if(this.tail == null){
           this.head = node; //-- 1st insert
           this.tail = node;
       }else{
           this.tail.setNext(node);
           this.tail = node;
       }

       size += 1;
    }

    public void insert(int val, int index){
        if(index <= 0){
            insertAtHead(val);
            return;
        }
        if(index >= size){
            insertAtTail(val);
            return;
        }

        Node afterNode = getNodeAt(index);
        Node beforeNode = afterNode.getNext();

        System.out.println("inserting after: "+afterNode.getValue() + " And  Before "+ beforeNode.getValue());

        Node node =  new Node(val,beforeNode);
        afterNode.setNext(node);

        size += 1;

    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();  //-- deleting head
        }

        Node afterNode = getNodeAt(index);

        Node toDeleteNode = afterNode.getNext();
        Node beforeNode = toDeleteNode.getNext();
        afterNode.setNext(beforeNode);

        size--;

        return toDeleteNode.getValue();
    }

    private Node getNodeAt(int index) {
        Node afterNode = this.head;
        for(int i = 0; i< index -1; i++){
            afterNode = afterNode.getNext();
        }
        return afterNode;
    }

    private int deleteFirst() {
        int val = this.head.getValue();
        this.head = this.head.getNext();
        if(this.head ==null){ //-- Only One element
            this.tail=null;
        }
        return val;
    }


    @Override
    public String toString() {
        Node temp = this.head;
        String str="";
        while(temp != null){
            str += temp.getValue();
            str += "->";
            temp = temp.getNext();
        }
        str += "End";
        return str;
    }

    public int getSize() {
        return size;
    }

}
