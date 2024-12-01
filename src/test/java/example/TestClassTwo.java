package test.java.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {
    @Parameters({"name"})
    @Test
    public void testMethodWithParameters(String name) {
        System.out.println("Parameter from xml: " + name);
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                {"Data 1"},
                {"Data 2"}
        };
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testMethodWithDataProvider(String data) {
        System.out.println("Data from DataProvider: " + data);
    }

}
