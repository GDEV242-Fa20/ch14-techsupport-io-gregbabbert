

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SupportSystemTest.
 *
 * @author  Greg Babbert
 * @version 11.30.2020
 */
public class SupportSystemTest
{
    /**
     * Default constructor for test class SupportSystemTest
     */
    public SupportSystemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInputsOne()
    {
        SupportSystem supportS1 = new SupportSystem();
        supportS1.start();
    }

    @Test
    public void testInputsTwo()
    {
        SupportSystem supportS1 = new SupportSystem();
        supportS1.start();
    }
}


