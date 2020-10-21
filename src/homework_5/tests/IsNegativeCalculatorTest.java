package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalculatorTest extends GeneralTests {

    @Test(dataProvider = "isNegativeDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorIsNegativeTest(long a, boolean expected) {
        System.out.println("Calculator is Negative Test Run");
        boolean actual = calculator.isNegative(a);
        Assert.assertEquals(actual, expected);
    }
}
