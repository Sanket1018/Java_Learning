class Computer {
    public void playMusic() {
        System.out.println("Music is playing");
    }

    public String giveMePen(int cost) {
        if (cost >= 10)
            return "pen";

        return "nothing";
    }

}

public class Demo {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();

        String str = obj.giveMePen(10);
        System.out.println(str);

    }

}
