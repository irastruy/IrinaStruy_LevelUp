package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerCalculatorTest extends GeneralTests {

    @Test(dataProvider = "powerDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorPowTest(double a, double b, double expected) {
        System.out.println("Calculator Power Test Run");
        double actual = calculator.pow(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
