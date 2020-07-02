package samplesTest;

import org.testng.Assert;


public class AssertionsSampleTest {
    //Should be in Test classes

    // compares 2 variables, are they the same
    //in case if fail - Error message will be thrown in console after test
        Assert.assertEquals(3,3,"Variables not the same");

    //same assert - compares 2 variables and check that they NOT the same.
        Assert.assertNotEquals("text 1","text 2","Error message");

    //asserts if condition is true, in case if false - going to throw error message
        Assert.assertTrue(1 < 2,"Error message");

    // asserts if conditions false
        Assert.assertFalse(1>2,"Error message");

    //assert null is used to verify if the provided object contains a null value
        Assert.assertNull(null,"Error message");

    //assert not null is used to verify that a provided object does not hold a null value
        Assert.assertNotNull("this string not null","Error message");


}
