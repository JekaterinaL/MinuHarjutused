package OOP;

/**
 * Created by Jekaterina on 29.01.2017.
 */
//Organasing of the code

public class Zoo {

    public static void main(String[] args) {


        Bird bird1 = new Bird(3, "F", 10);
        bird1.eat();
        bird1.sleep();


        Chicken chick1 = new Chicken(3, "F", 7);
        chick1.sleep();

        Animal spar1 = new Sparrow(3, "M", 9);
        //spar1.fly();      //if type is Animal no fly is avaible
        //spar1.move();

        Animal fish1 = new Fish(1, "M", 2);
        //fish1.move();

        moveAnimals(fish1);     //=fish1.move();

        moveAnimals(spar1);     //=spar1.move();

        Flyable flyableBird = new Sparrow(3, "M", 9);
        flyableBird.fly();

        //Flyable flyableBird2 = new Bird(1, "M", 3);   //impossible, Bird doest implement Flyable

    }

    public static void moveAnimals(Animal animal){
        animal.move();
    }
}
