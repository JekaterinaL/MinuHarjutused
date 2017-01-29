package Second;

/**
 * Created by Jekaterina on 29.01.2017.
 */
public class Student {

    int id;
    String name;
    int age;

    public int getId() {    //right click on id - Generate - Getters and Setters
        return id;          //seda nimetatakse encapsulation
                            //to get Id we use getID
    }

    public void setId(int id) { //to set Id we use setID
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
