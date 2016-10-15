package zoo.mammals;

/**
 * Created by gharpure on 10/14/16.
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
