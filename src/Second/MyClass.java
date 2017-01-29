package Second;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class MyClass {
    public static void main (String[] args) {
        Student mark = new Student();   //mark - object; instance

        mark.setId(1);      //eelistatud viis
        mark.setName("Mark");
        mark.setAge(15);

        Student tom = new Student();

        tom.id = 2;
        tom.name = "Tom";
        tom.age = 14;

        System.out.println(mark.getName() + " is " + mark.getAge() + " ears old!");
        System.out.println(tom.name + " is " + tom.age + " ears old!");
    }
}
