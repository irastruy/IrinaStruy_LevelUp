package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalculatorTest extends GeneralTests {

    @Test(dataProvider = "ctgDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorCtgTest(double a, double expected) {
        System.out.println("Calculator ctg Test Run");
        double actual = calculator.ctg(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
