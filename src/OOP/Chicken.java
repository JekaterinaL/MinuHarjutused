package OOP;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Chicken extends Bird {

    public Chicken(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    //overriding the method difined in Bird
    /**public void fly() {
        System.out.println("Not able to fly...");
    }
     */
}
