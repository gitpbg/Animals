package zoo.mammals;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 * FourLeggedAnimal inherits the hasTail method from BaseAnimal
 * And implements getNumberOfLegs
 * BUT it still does not implement all the methods from the IAnimal class
 * AND hence it is also abstract
 *
 * In addition this class introduces a new abstract method getISay
 * and uses it to implement the saySomething method.
 */
abstract class FourLeggedAnimal extends BaseAnimal {
    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    public abstract String getISay();

    public void saySomething() {
        System.out.println(getISay());
    }
}
