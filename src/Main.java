import java.util.Scanner;

/**
 * Created by Dam on 2018-11-17.
 */
public class Main {

    public static void main(String[] args) {
        String name = "Mika";
        Wizzard mika = new Wizzard(name);
        Wizzard lula = new Wizzard("lula");
        mika.intoduce();
        lula.intoduce();

        lula.levitate();
        lula.levitate();
        lula.levitate();

        mika.levitate();
        mika.levitate();
        mika.levitate();
        mika.levitate();
        mika.levitate();
        mika.levitate();


        System.out.println("Mana " + mika.getMana());
        System.out.println("Mana " + lula.getMana());



        Pet lajka = new Pet("pies", "red");
        lajka.age = 5;
        lajka.weight = 20;
        lajka.color = "Red";
        lajka.introduce();
        lajka.saysomething("Hau hau hau");
        lajka.saysomething(name);
        System.out.println(lajka.getName());

        Beer zuberek = new Beer("zuberek");
        System.out.println(zuberek.getName());
        zuberek.drink(100);
        zuberek.drink(100);
        System.out.println("Pozostalo " + zuberek.getCurrentCapacity());
        System.out.println("Procentowo wypito " + Math.round(zuberek.getDrinkedPercentage()));


        Pet[] animals = new Pet[5];


        animals[0] = lajka;
        animals[1] = new Pet("chuj", "red");;
        animals[2] = new Pet("zuber", "red");
        animals[3] = new Pet("zywiec", "red");
        animals[4] = new Pet("kubek", "red");

        for (int counter = 0; counter < animals.length; counter++) {
            animals[counter].introduce();
        }




    }


}
