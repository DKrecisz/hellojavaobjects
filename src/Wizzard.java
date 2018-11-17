/**
 * Created by Dam on 2018-11-17.
 * definotion of a wizzard class
 * it has int property called mana with value 10
 * it has String property called Name without value
 */
public class Wizzard {
    /**
     * it defines property called mana which is int and has value of 10
     */
    private int mana = 10;

    public String name;

    /**
     * this is constructor its invoked when we create a Wizzard object
     * contructor must have same name as the class
     * it takes 1 String argument called name and then it saves it as Wizzards name property ( defined on line 10 )
     * @param name
     */
    public Wizzard(String name) {
        this.name = name;
    }

    /**
     * this is a method which can be called on object of Wizzard class
     * it reduces mana property by 2
     */
    public void levitate() {
        this.mana = this.mana - 2;
        System.out.println("Czaruje " );
    }

    /**
     * this is a method that returns current value of wizzard property mana
     * it passes the value of mana to a place where method is called
     * currently its called in Main.java
     * @return
     */
    public int getMana() {
        return this.mana;
    }

    /**
     * this is a method which can be called on object of Wizzard class
     * it prints in terminal Wizzard object name
     * it returns nothing ( void )
     */
    public void intoduce() {
        System.out.println("Nazywam sie " + this.name);
    }

}





