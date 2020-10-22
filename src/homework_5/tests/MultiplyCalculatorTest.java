package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyCalculatorTest extends GeneralTests {

    @Test(dataProvider = "multiplyDoubleDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorMultiplyDoubleTest(double a, double b, double expected) {
        System.out.println("Calculator Multiply Double Test Run");
        double actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "multiplyLongDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorMultiplyLongTest(long a, long b, long expected) {
        System.out.println("Calculator Multiply Test Long Run");
        long actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

}
