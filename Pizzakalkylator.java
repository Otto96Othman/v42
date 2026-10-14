
public class Pizzakalkylator {

    public static double beraknaPris(int antalPizzor, double prisPerPizza) {
        double totalPris = antalPizzor * prisPerPizza;
        return totalPris;
    }

    public static void main(String[] args) {
        double pris = beraknaPris(3, 120);
        System.out.println("Totalt pris: " + pris + " kr");
    }
}
