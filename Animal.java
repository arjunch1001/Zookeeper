public class Animal {
    private String food;
    private boolean nocturnal;
    private double avgLifeSpan;

    public Animal() {
        this.food = "unknown";
        this.nocturnal = false;
        this.avgLifeSpan = 0.0;
    }

    public Animal(String food, boolean nocturnal, double avgLifeSpan) {
        this.food = food;
        this.nocturnal = nocturnal;
        this.avgLifeSpan = avgLifeSpan;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }

    public String toString() {
        return "This is an object of the Animal class.";
    }
}
