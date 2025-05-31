public class Demo {
    public static void main(String[] args) {
        String name = "Sanket";
        String name1 = new String("Rohan");

        // Strings are immutable

        System.out.println(name);
        System.out.println(name1);

        System.out.println(name + "Chavan");
        System.out.println(name);

        // StringBuffer
        // StringBuilder

        // StringBuffer are mutable
        StringBuffer sb = new StringBuffer("Sanket");
        System.out.println(sb);
        sb.append(" Sunbeam");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println();

        // StringBuffer are thread safe
        // StringBuilder are nor thread safe
    }
}