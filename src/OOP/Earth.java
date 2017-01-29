package OOP;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Earth {

    public static void main(String[] args){

        Human tom;

        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";

        tom.speak();

        Human joe;

        joe = new Human();
        joe.age = 7;
        joe.eyeColor = "green";
        joe.heightInInches = 90;
        joe.name = "Joe Jon";

        joe.speak();


    }
}
