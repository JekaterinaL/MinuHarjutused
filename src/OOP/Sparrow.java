package OOP;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Sparrow extends Bird implements Flyable{

    public Sparrow(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}
