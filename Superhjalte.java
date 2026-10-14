
public class Superhjalte {

    public static int powerLevel(int strength, int speed) {
        return strength + speed;
    }

    public static void main(String[] args) {
        int kraft = powerLevel(80, 60);
        System.out.println("Superhjältens kraft: " + kraft);
    }
}
