public class LinkedList {
    private Node head;
    public LinkedList(){
        head = null;
    }

    public void InsertAtHead(int data){
        /*
        Create new node
        Point its next to head
        point head to this node
        */
        Node nd = new Node(data);
        if(head != null){
            nd.next = head;
        }
        head = nd;
    }

    public Node findLast(){
        if(head == null){
            return null;
        }
        Node trav = head;
        while(trav.next != null){
            trav = trav.next;
        }
        return trav;
    }

    public void InsertAtTail(int data){
        // When Linked List is empty
        if(head == null){
            Node nd = new Node(data);
            head = nd;
        }
        else{
            Node nd = new Node(data);
            Node tail = findLast();
            tail.next = nd;
        }
    }
    public void printList(){
        Node trav = head;
        while(trav != null){
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

}
