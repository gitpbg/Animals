package zoo.mammals;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 */
public abstract class FourLeggedAnimal extends BaseAnimal {
    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    public abstract String getISay();

    public void saySomething() {
        System.out.println(getISay());
    }
}
