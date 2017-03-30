package chapter4.quetion3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        BabySheep bs = new BabySheep();

        System.out.println(bs.Defaecate());

    }

}

class Animal
{


    public String sleep()
    {
        return "Sleeping";

    }





}

class Cow implements Vegetarian
{
    private Animal animal;

    Cow() {
        setAnimal();
    }

    public void getMilk()
    {
        System.out.println("Cow Produced milk");
    }

    public void speak()
    {
        System.out.println("Cow said: 'Mooooo'");
    }

    public String eatGrass()
    {
        return "Eat grass";
    }

    public String Defaecate()
    {
        return ("cow feaces");
    }

    public void setAnimal()
    {
        animal=new Animal();
    }

    public Animal getAnimal()
    {
        return animal;
    }

}

class Sheep implements Vegetarian
{
    private Animal animal;

    Sheep()
    {
        setAnimal();
    }
    public void getWool()
    {
        System.out.println("Sheep Produced Wool");
    }

    public void speak()
    {
        System.out.println("Sheep said: 'Beehhh'");
    }

    public String eatGrass()
    {
        return "Eat grass";
    }

    public String defaecate()
    {
        return "sheep feaces";
    }

    public void setAnimal()
    {
        animal=new Animal();
    }

    public Animal getAnimal()
    {
        return animal;
    }
}

class BabySheep
{
    private Sheep sheep;

    BabySheep()
    {
        setSheep();
    }


    public String Defaecate()
    {
        return "baby " + sheep.defaecate();
    }

    public void setSheep()
    {
        sheep=new Sheep();
    }

    public Sheep getSheep()
    {
        return sheep;
    }
}

class Chicken implements Bird
{

    private Animal animal;

    Chicken() {
        setAnimal();
    }

    public String wings() {
        return ("Flap");
    }

    public String layEgg()
    {
        return ("Chicken laid an egg");
    }

    public void setAnimal()
    {
        animal=new Animal();
    }

    public Animal getAnimal()
    {
        return animal;
    }
}

interface Bird
{
    public String wings();
    public String layEgg();
}

interface Vegetarian
{
    public String eatGrass();
}
