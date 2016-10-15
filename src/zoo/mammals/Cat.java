package zoo.mammals;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 */
public class Cat extends FourLeggedAnimal {


    @Override
    public void jump() {
        System.out.println("Who me");
    }

    @Override
    public String getKind() {
        return "Cat";
    }

    @Override
    public String getName() {
        return "Billy";
    }

    @Override
    public String getISay() {
        return "Meow";
    }
}
