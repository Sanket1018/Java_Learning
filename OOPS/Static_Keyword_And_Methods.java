
class Mobile {
    String name;
    int price;
    static String type;

    public void display() {
        System.out.println(name + " " + price + " " + type + " ");
    }

    public static void show(Mobile obj1) {
        // System.out.println(name + " " + price + " " + type + " ");
        // We cant able to use instance variables in static method directly
        // Why this is not directy possible because if we are going to use not static
        // varibles with classname there are actully different values for different
        // objects.
        // but we can use it indirectly by passing the object

        System.out.println(obj1.name + " " + obj1.price + " " + obj1.type + " ");

    }
}

public class Static_Keyword_And_Methods {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.name = "Apple";
        obj1.price = 2000;
        Mobile.type = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.name = "Samsung";
        obj2.price = 1000;
        Mobile.type = "SmartPhone";

        obj1.display();
        obj2.display();

        Mobile.show(obj1);

    }

}