public class Main2 {
    public static void main(String[] args) {
        /*
        Oop Principles:
        1) Encapsulation
        2) ...
         */

        /*
        1) Generics
        2) To String methods
        3) Reverse Linked List Algorithm

         */

        Student st1 = new Student("Luqman", 0, 99);
        Student st2 = new Student("Tolly", 1, 100);

        LinkedList lst = new LinkedList();
        lst.InsertAtTail(st1);
        lst.InsertAtTail(st2);

        lst.printList();
    }
}
