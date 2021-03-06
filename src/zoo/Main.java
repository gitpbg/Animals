package zoo;

import zoo.Protozoa.Amoeba;
import zoo.animal.IAnimal;
import zoo.mammals.Cat;
import zoo.mammals.Cow;
import zoo.mammals.Dog;
import zoo.mammals.Fox;

/*
    The Main class
    This is where the action starts and ends
 */

public class Main {

    public static void main(String[] args) {
        //array of IAnimal objects
        IAnimal[] animals = new IAnimal[4];
        //Note how Dog, Cat, Cow, Amoeba are all IAnimal
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();
        animals[3] = new Amoeba();
       // animals[4] = new Fox    ();

        for (IAnimal a : animals) {
            a.saySomething();
            System.out.println("I am a " + a.getKind());
            System.out.println("My name is " + a.getName());
            System.out.println("I have " + a.getNumberOfLegs() + " legs");
            System.out.println("Jump");
            a.jump();
            if (a.hasTail()) {
                System.out.println("I have a tail");
            }
            System.out.println("---------------------");
        }
    }
}
