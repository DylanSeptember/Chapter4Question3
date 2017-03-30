package chapter4.quetion3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cow cow = new Cow();
        cow.eat();
        cow.getMilk();
        cow.sleep();

    }

}

class Animal
{
    public void eat()
    {
        System.out.println("Eat grass");
    }

    public void sleep()
    {
        System.out.println("Sleeping");
    }

}

class Cow extends Animal
{
    public void getMilk()
    {
        System.out.println("Produced milk");
    }
}