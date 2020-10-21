package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtCalculatorTest extends GeneralTests {

    @Test(dataProvider = "sqrtDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorSqrtTest(double a, double expected) {
        System.out.println("Calculator sqrt Test Run");
        double actual = calculator.sqrt(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
