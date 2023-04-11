package abstraction;

public class AbstractionTest {
    public static void main(String[] args) {
        KrishiBank b = new KrishiBank();
        System.out.println(b.getRateOfInterest());
        PubaliBank pubaliBank = new PubaliBank();
        System.out.println(pubaliBank.getRateOfInterest());

    }
}
