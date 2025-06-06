class Human {
    private String name;
    private int age;

    public Human() {

        System.out.println("Human constructor is called");
    }

    public Human(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("Parameterzied  Human constructor is called");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class Constructors extends Human {
    public static void main(String[] args) {
        System.out.println("main method called");
        // Human obj1 = new Human(); // Parameterless constrcutor is called
        // Human obj2 = new Human("Sanket", 22); // Parameterized constructor is called
        // System.out.println(obj2.getName());
        // System.out.println(obj2.getAge());
        // Constructors con = new Constructors();
        Constructors con1 = new Constructors(22);

    }

    public Constructors() {
        System.out.println("Constructor class constructor is called");
    }

    public Constructors(int a) {
        super("Sanket", 22);
        System.out.println("Parameterzied Constructor class of constructor is called");
    }

}
