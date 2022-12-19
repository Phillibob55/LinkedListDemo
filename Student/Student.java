public class Student {
    public String name;
    public int id;
    public float score;

    // Default Constructor
    public Student(){
        name = "";
        id = -1;
        score = 0;
    }

    //Parametrized Constructor
    public Student(String name, int id, float score){
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public void printData(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Score: " + score);
    }

    public static void help(){
        System.out.println("This is the student class that stores data about one student.");
    }
}
