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

    public String eatGrass()                   //violate OCP and LSP and CRP
    {
        return "Eat grass";
    }

    public String getFaeces()
    {
        return "feaces";
    }

}

class Cow
{
    private Animal animal;

    Cow() {
        setAnimal();
    }

    public void getMilk()
    {
        System.out.println("Cow Produced milk");
        System.out.println("Cow said: 'Mooooo'");           //Speak     //violate SRP
    }

    public String Defaecate()
    {
        return ("cow " + animal.getFaeces());        //violate DIP
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

class Sheep
{
    private Animal animal;

    Sheep()
    {
        setAnimal();
    }
    public void getWool()
    {
        System.out.println("Sheep Produced Wool");
        System.out.println("Sheep said: 'Beehhh'");           //Speak     //violate SRP
    }

    public String defaecate()
    {
        return "sheep " + animal.getFaeces();        //violate DIP
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
        return "baby " + sheep.defaecate();        //violate LSP
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

    public String fly() {
        return ("Fly");
    }

    public String layEgg()
    {
        return ("Chicken laid an egg");      // Chickens don't lay eggs
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
    public String fly();                    // violate ISP
    public String layEgg();
}
