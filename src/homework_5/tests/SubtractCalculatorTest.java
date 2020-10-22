package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractCalculatorTest extends GeneralTests {

    @Test(dataProvider = "subtractDoubleDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorSubtractDoubleTest(double a, double b, double expected) {
        System.out.println("Calculator subtract Double Test Run");
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "subtractLongDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorSubtractLongTest(long a, long b, long expected) {
        System.out.println("Calculator subtract Test Long Run");
        long actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }
}
