package chapter4.quetion3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.TestCase.assertNotNull;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

    private Eat eat1;
    @Before
    public void testBean1() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        eat1 = (Eat) ctx.getBean("eat1");

    }

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
