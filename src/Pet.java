/**
 * Created by Dam on 2018-11-17.
 */
public class Pet {
    private String name;
    public int age = 0;
    public float weight = 1;
    public String color;

    public Pet (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void introduce() {
        System.out.println("Hau");
        System.out.println(this.age);
        System.out.println(this.weight);
        System.out.println(this.color);
    }

    public void saysomething(String whatToSay) {
        System.out.println("Hau " + whatToSay);
    }

    public String getName() {
        return this.name;

    }

}
