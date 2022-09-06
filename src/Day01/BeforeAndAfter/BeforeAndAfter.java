package Day01.BeforeAndAfter;

import Day01.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfter {
    @Before
    public void init() {
        System.out.println("init...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        Assert.assertEquals(3, result);
        System.out.println("testAdd...");
    }
}
