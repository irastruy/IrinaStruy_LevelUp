package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalculatorTest extends GeneralTests {

    @Test(dataProvider = "sinDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorSinusTest(double a, double expected) {
        System.out.println("Calculator sin Test Run");
        double actual = calculator.sin(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
