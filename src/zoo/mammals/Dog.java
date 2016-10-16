package zoo.mammals;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 * Dog extends FourLeggedAnimal
 * so it inherits the hasTail, saySomething, getNumberOfLegs methods
 * and implements the jump, getKind and getName to fulfill the IAnimal contract
 * and implements the getISay method to fufill the FourLeggedAnimal contract

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
