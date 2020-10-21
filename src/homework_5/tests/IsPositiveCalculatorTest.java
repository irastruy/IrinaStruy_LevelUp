package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalculatorTest extends GeneralTests {

    @Test(dataProvider = "isPositiveDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorIsPositiveTest(long a, boolean expected) {
        System.out.println("Calculator is Positive Test Run");
        boolean actual = calculator.isPositive(a);
        Assert.assertEquals(actual, expected);
    }
}
