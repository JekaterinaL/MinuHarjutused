package OOP;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Fish extends Animal {      //as a child of Animal

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming...");

    }

    public void swim() {
        System.out.println("Swimming...");
    }
}
