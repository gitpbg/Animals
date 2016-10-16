package zoo.mammals;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 * This is a base animal class that only implements the hasTail method
 * And because it does not fulfil the interface contract, there can be no BaseAnimal object
 * And hence it is declared as abstract
 */
abstract class BaseAnimal implements IAnimal {
    @Override
    public boolean hasTail() {
        return true;
    }
}
