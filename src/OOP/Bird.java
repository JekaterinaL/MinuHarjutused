package OOP;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Bird extends Animal {      //as subclass or child, extends mean that
                                        // we do not need to rewrite Animal methods

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }

    /**public void fly() {      //not optional for all birds
        System.out.println("Flying...");
    }
     */
}
