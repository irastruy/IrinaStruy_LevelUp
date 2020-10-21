package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCalculatorTest extends GeneralTests {

    @Test(dataProvider = "addDoubleDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorAddDoubleTest(double a, double b, double expected) {
        System.out.println("Calculator Add Double Test Run");
        double actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "addLongDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorAddLongTest(long a, long b, long expected) {
        System.out.println("Calculator Add Test Long Run");
        long actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected, 0.000001);
    }

}
