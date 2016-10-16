package zoo.animal;

/**
 * Created by gharpure on 10/14/16.
 * This is the IAnimal interface
 * As we learned an interface is a contract.
 * And a class that claims to honor the contract via the implements keyword, has to implement all methods
 *
 * Interfaces don't implement methods
 */
public interface IAnimal {
    int getNumberOfLegs();
    void saySomething();
    void jump();
    String getKind();
    String getName();
    boolean hasTail();
}
