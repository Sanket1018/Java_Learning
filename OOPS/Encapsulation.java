
class Human {
    private String name = "Virat";
    private int age = 15;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        if (age >= 18) {
            return age;
        } else {
            return -1;
        }

    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj1 = new Human();
        // System.out.println(obj1.name);
        // System.out.println(obj1.age);

        System.out.println(obj1.getName());
        int res = (obj1.getAge());
        if (res != -1) {
            System.out.println("Valid age");
        } else {
            System.out.println("Invalid age");
        }

    }
}
