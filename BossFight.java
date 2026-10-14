
public class BossFight {

    // Instansvariabel: monstrets hälsa
    int monsterHealth = 100;

    // Void-metod med en parameter
    public void attack(int damage) {
        monsterHealth = monsterHealth - damage;
        System.out.println("Du attackerar monstret!");
        System.out.println("Skada: " + damage);
    }

    // Metod som returnerar ett värde
    public int getMonsterHealth() {
        return monsterHealth;
    }

    // Static-metod
    public static void showWelcome() {
        System.out.println("Välkommen till Boss Fight!");
    }

    public static void main(String[] args) {

        // Anropa static-metoden utan att skapa ett objekt
        showWelcome();

        // Skapa ett objekt
        BossFight fight = new BossFight();

        // Anropa metoder med punktoperatorn
        fight.attack(30);
        System.out.println("Monstrets hälsa: "
                + fight.getMonsterHealth());

        fight.attack(20);
        System.out.println("Monstrets hälsa: "
                + fight.getMonsterHealth());
    }
}
