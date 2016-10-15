package zoo.mammals;

import zoo.animal.IAnimal;

/**
 * Created by gharpure on 10/14/16.
 */
public abstract class BaseAnimal implements IAnimal {
    @Override
    public boolean hasTail() {
        return true;
    }
}
