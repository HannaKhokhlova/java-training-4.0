import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {2, 4, 8},
                {5, 10, 50},
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {-4, -2},
                {5, -2}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {
        int actualArea = ExampleException.rectangleArea(a, b);
        assertEquals(actualArea, c, "Area calculation is incorrect!");
    }


    @Test(dataProvider = "negativeData",  expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "input value is below zero!")
    public void testRectangleAreaNegative(int a, int b) {
        ExampleException.rectangleArea(a, b);
    }
}