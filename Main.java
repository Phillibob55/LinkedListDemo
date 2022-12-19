public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtTail(10); 
        list.InsertAtTail(20); 
        list.InsertAtTail(30); 
        list.InsertAtTail(40); 

        list.printList();

    }
}

/*
    Problems with Dyamic Arrays:
    1) Deleting, adding in the middle was really slow.
    2) Not a good option for small sizes
*/
