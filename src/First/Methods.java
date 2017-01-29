package First;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Methods {

    public static void main (String[] args){
        sayHello("John");
        sayHello("Katja");
        sayHello("Dima");
        sayHello("Maksim");

        int sum = add(100, 201);
        int result = sum * 10;
        System.out.println(result);
    }

    public static void sayHello(String name) {    //public - kättesaadav igal pool programmis
        System.out.println("Hello, " + name);                //name - parameter passing
    }

    public static int add(int a, int b) {
        //System.out.println(a + b);
        return (a + b);
    }
}
