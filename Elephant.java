public class Elephant extends Animal {

    public Elephant(String food, boolean nocturnal, double avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
    }

    public void trumpet() {
        System.out.println("The elephant trumpets!");
    }

    @Override
    public String toString() {
        return "This is an object of the Elephant class.";
    }
}
