package test.java.example;

import org.testng.annotations.*;

public class TestClassOne {
    @BeforeClass()
    public void setUp() {
        System.out.println("Setting up TestClassOne");
    }

    @Test(groups = {"smoke"})
    public void testMethod1() {
        System.out.println("Executing Test Method 1 in Smoke Group");
    }

    @Test(groups = {"smoke"})
    public void testMethod2() {
        System.out.println("Executing Test Method 2 in Smoke Group");
    }

    @Test(groups = {"regression"})
    public void testMethod3() {
        System.out.println("Executing Test Method 3 in Regression Group");
    }

    @AfterClass()
    public void tearDown() {
        System.out.println("Tearing down TestClassOne");
    }

    @Test(groups = {"exclude"}, enabled = false)
    public void excludedMethod() {
        System.out.println("This method is excluded from execution");
    }

}
