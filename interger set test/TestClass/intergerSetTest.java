// ALT ENTER TO IMPORT ASSERTEQUALS

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class intergerSetTest {
    IntegerSet testSet;

    @Before
    public void setup() {
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere() {
        //Check number is not already there
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contains(3));

        //Insert a number
        testSet.insert(3);

        //Check the number is in set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));

    }
}
