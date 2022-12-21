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

        // Student st1 = new Student("1", 1, 1);
        // Student st2 = new Student("2", 2, 2);
        // Student st3 = new Student("3", 3, 3);
        // Student st4 = new Student("4", 4, 4);
        // Student st5 = new Student("10", 10, 10);
        Student st6 = new Student(1);
        Student st7 = new Student(2);
        Student st8 = new Student(3);
        Student st9 = new Student(4);
        Student st10 = new Student(5);

        LinkedList lst = new LinkedList();
        lst.insertAtTail(st6);
        lst.insertAtTail(st7);
        lst.insertAtTail(st8);
        lst.insertAtTail(st9);
        lst.printList();
        lst.insert(4, st10);
        lst.printList();

    }
}
