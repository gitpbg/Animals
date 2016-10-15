package zoo.mammals;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 */
public class Dog extends FourLeggedAnimal {

    @Override
    public String getISay() {
        return "Bow Wow";
    }

    @Override
    public void jump() {
        System.out.println("Jumped");
    }

    @Override
    public String getKind() {
        return "Dog";
    }

    @Override
    public String getName() {
        return "Tommy";
    }
}
