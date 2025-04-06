public class ZooKeeperRunner {
    public static void main(String[] args) {
        // Constructing an Animal reference with an Elephant object
        Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(a.isNocturnal());
        // a.trumpet(); // ERROR: Cannot call method trumpet() on Animal reference

        // Testing sleep method
        Animal a1 = new Animal();
        a1.sleep();

        Object a2 = new Animal();
        // a2.sleep(); // ERROR: Cannot call method sleep() on Object reference

        // Testing toString behavior
        Object o = new Object();
        System.out.println(o.toString()); // Default Object toString()

        Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(e.toString()); // Elephant's overridden toString()

        Animal a3 = new Animal();
        System.out.println(a3.toString()); // Animal's toString() or Object's if not overridden

        Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(a4.toString()); // Elephant's toString() at runtime

        Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(o2.toString()); // Elephant's toString() at runtime
    }
}
