package zoo.mammals;

/**
 * Created by gharpure on 10/14/16.
 * Cow extends FourLeggedAnimal
 * so it inherits the hasTail, saySomething, getNumberOfLegs methods
 * and implements the jump, getKind and getName to fulfill the IAnimal contract
 * and implements the getISay method to fufill the FourLeggedAnimal contract

 */
public class Cow extends FourLeggedAnimal {

    @Override
    public String getISay() {
        return "Moo";
    }


    @Override
    public void jump() {
        System.out.println("Whoa");
    }

    @Override
    public String getKind() {
        return "Bovine";
    }

    @Override
    public String getName() {
        return "Bessy";
    }
}
