public class Node{
    //data
    //next reference
    // {data, reference}
    public Student data;
    public Node next;

    public Node(){
        data = null;
        next = null;
    }
    
    public Node(Student data){
        this.data = data;
        next = null;
    }

    public Node(Student data, Node next){
        this.data = data;
        this.next = next;
    }
}