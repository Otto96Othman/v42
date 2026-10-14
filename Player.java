
public class Player {

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Player player = new Player();

        player.setScore(100);
        System.out.println("Spelarens poäng: " + player.getScore());

        player.setScore(250);
        System.out.println("Ny highscore: " + player.getScore());
    }
}
