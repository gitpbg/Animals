package zoo.Protozoa;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 * This class fulfils the IAnimal contract by implementing all the methods
 */
public class Amoeba implements IAnimal {

    @Override
    public int getNumberOfLegs() {
        return 0;
    }

    @Override
    public void saySomething() {
        System.out.println("");
    }

    @Override
    public void jump() {
        System.out.println("Are you kidding");
    }

    @Override
    public String getKind() {
        return "Amoeba";
    }

    @Override
    public String getName() {
        return "Celly";
    }

    @Override
    public boolean hasTail() {
        return false;
    }
}
