package OOP;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public abstract class Animal {       //as parent class
                                        //abstract is always parent

    int age;
    String gender;
    int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;

    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();
}
