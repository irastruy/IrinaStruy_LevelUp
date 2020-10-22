package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideCalculatorTest extends GeneralTests {

    @Test(dataProvider = "divideDoubleDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorDivideDoubleTest(double a, double b, double expected) {
        System.out.println("Calculator Divide Double Test Run");
        double actual = calculator.div(a, b);
        System.out.println("actual is " + actual + " but expected is " + expected);
        Assert.assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "divideLongDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorDivideLongTest(long a, long b, double expected) {
        System.out.println("Calculator Divide Test Long Run");
        double actual = calculator.div(a, b);
        System.out.println("actual is " + actual + " but expected is " + expected);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
