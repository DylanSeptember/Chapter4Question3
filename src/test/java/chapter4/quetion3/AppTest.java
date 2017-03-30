package chapter4.quetion3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

import static junit.framework.TestCase.assertNotNull;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    @org.junit.Test
    public void testAnimal()
    {
        Animal animal = new Animal();

        Assert.assertNotNull(animal);
    }

    @org.junit.Test
    public void testCow()
    {
        Cow cow = new Cow();

        Assert.assertNotNull(cow);
    }
}
