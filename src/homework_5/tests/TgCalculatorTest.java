package homework_5.tests;

import homework_5.tests.DataProviders.CalculatorDataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalculatorTest extends GeneralTests {

    @Test(dataProvider = "tgDataProvider", dataProviderClass = CalculatorDataProviderTest.class)
    public void calculatorTgTest(double a, double expected) {
        System.out.println("Calculator tg Test Run");
        double actual = calculator.tg(a);
        Assert.assertEquals(actual, expected, 0.000001);
    }
    
    
}
