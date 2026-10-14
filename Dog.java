
public class Dog {

    int hunger = 10;

    public void eat() {
        hunger = hunger - 1;
    }

    public void showHunger() {
        System.out.println("Hundens hunger: " + hunger);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.showHunger();
        dog.eat();
        dog.showHunger();
    }
}
