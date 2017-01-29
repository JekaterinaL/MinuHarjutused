package Second;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class CubeMain {

    public static void main (String[] args) {
        Cube cube1 = new Cube();        //constructor of Cube class

        System.out.println(cube1.getCubeVolume());

        Cube cube2 = new Cube(20, 20, 20);

        System.out.println(cube2.getCubeVolume());

        System.out.println(add(1, 36));
        System.out.println(add(5.5, 5.6));
        System.out.println(add("Hello ", "world!"));
    }

    public static int add (int a, int b) {      //method overloading
                                                //define different method with the same name
                                                //logically same function
        return (a + b);
    }

    public static double add (double a, double b) {
        return (a + b);
    }

    public static String add (String a, String b) {
        return (a + b);
    }
}
