package Second;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Cube {
    int lenght;
    int bredth;
    int height;

    public int getCubeVolume() {
        return (lenght * bredth * height);
    }

    Cube () {       //default constructor; constructs never return any value;
                    //constructor have the same name as Class
                    //can take parameter
                    //we can use multiple constructor
        System.out.println("We are in constructor");
        lenght = 10;        //define constructor variables
        bredth = 20;
        height = 30;
    }

    Cube (int l, int b, int h) {        //overload constructor
        lenght = l;
        bredth = b;
        height = h;
    }

}
