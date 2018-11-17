/**
 * Created by Dam on 2018-11-17.
 */
public class Beer {
    private String name;
    private int maxCapacity = 500;
    private int currentCapacity = 500;

    public Beer(String newName) {
        this.name = newName;
    }
    public String getName() {
        return this.name;
    }
    public void drink(int howMuch){
        this.currentCapacity = this.currentCapacity - howMuch;
    }

    public int getCurrentCapacity() {
        return this.currentCapacity;
    }
    public float getDrinkedPercentage() {
        return (float) this.currentCapacity / (float) this.maxCapacity * (float) 100;

    }
}
