package linkedList;

public class LinkedList {

    Node head = null;

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = head.next;
        Node next = head.next.next;
        head.next = null;
        while (prev != null) {
            prev.next = head;
            head = prev;
            prev = next;
            if (next != null)
                next = next.next;
        }
    }

    public void findMidElement() {
        Node fastNode = head;
        Node slowNode = head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        System.out.println("Mid Element : " + slowNode.data);
    }

    public void createCycleAt(int index) {
        Node temp = head;
        for(int i=1;i<index;i++)
            temp=temp.next;

        temp.next=head.next.next;
    }

    public void detectCycle() {
        Node fastNode = head;
        Node slowNode = head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(slowNode==fastNode){
                System.out.println("Cycle detected at node : "+slowNode.data);
                break;
            }
        }
    }

    public void removeNthElement(int n) {
        Node curr = head;
        Node next = head.next;
        if(n==1){
            head=next;
        } else if (n==2) {
            head.next = next.next;
        }else{
            for(int i=1;i<n-1; i++){
                curr=curr.next;
                next=next.next;
            }
            if(next!=null)
                curr.next=next.next;
        }
    }
}
