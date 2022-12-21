public class LinkedList {
    private Node head;
    public LinkedList(){
        head = null;
    }
    public void insert(int index, Student data){
        //Combines head, index, and tail insert
        if(index == 0){
            Node nd = new Node(data);
            if(head != null){
                nd.next = head;
            }
            head = nd; 
        }
        else if(index == listLength()){
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
        else{
            int i = 0;
            Node trav = head;
            while(i < index - 1){
                trav = trav.next;
                i++;
            }
            Node nd = new Node(data);
            nd.next = trav.next;
            trav.next = nd;
        }
    }
    // public void insertAtHead(Student data){
    //     /*
    //     Create new node
    //     Point its next to head
    //     point head to this node
    //     */
    //     Node nd = new Node(data);
    //     if(head != null){
    //         nd.next = head;
    //     }
    //     head = nd;
    // }
    // public void insertBeforeNode(int index, Student data){
    //     int i = 0;
    //     Node trav = head;
    //     while(i < index - 1){
    //         trav = trav.next;
    //         i++;
    //     }
    //     Node nd = new Node(data);
    //     nd.next = trav.next;
    //     trav.next = nd;
        
    // }
    // public void insertAtTail(Student data){
    //     // When Linked List is empty
    //     if(head == null){
    //         Node nd = new Node(data);
    //         head = nd;
    //     }
    //     else{
    //         Node nd = new Node(data);
    //         Node tail = findLast();
    //         tail.next = nd;
    //     }
    // }
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
    public Node findPrevious(Node nd){
        Node previous = head;
        while(previous.next != nd){
            previous = previous.next;
        }
        return previous;
    }

    public void delete(int index){

        Node trav = head;
        for(int i = 0; i < index; i++){
            trav = trav.next;
        }

        if(trav == head){
            head = head.next;
        }
        else if(trav.next == null){
            Node previous = findPrevious(trav);
            previous.next = null;
        }
        else{
            Node previous = findPrevious(trav);
            previous.next = trav.next;
        }
    }

    public void printList(){
        Node trav = head;
        while(trav != null){
            //System.out.print(trav.data + " ");
            trav.data.printData();
            trav = trav.next;
        }
        System.out.println();
    }
    public int listLength(){
        if(head == null){
            return 0;
        }
        else if(head.next == null){
            return 1;
        }
        int i = 1;
        Node trav = head;
        while(trav.next != null){
            trav = trav.next;
            i++;
        }
        return i;
    }

}
