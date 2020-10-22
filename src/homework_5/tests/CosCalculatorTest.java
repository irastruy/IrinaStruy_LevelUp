package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalculatorTest extends GeneralTests {

    @Test(dataProvider = "cosDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorCosinusTest(double a, double expected) {
        System.out.println("Calculator cosinus Test Run");
        double actual = calculator.cos(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
    


}
