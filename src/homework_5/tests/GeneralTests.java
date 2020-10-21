package homework_5.tests;

import org.testng.annotations.*;
import ru.levelup.qa.at.calculator.Calculator;

public abstract class GeneralTests {

    protected Calculator calculator;

    @BeforeMethod
    public void setUpTestSuite() {
        System.out.println("Set up Test Suite");
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDownTestSuite() {
        System.out.println("Tear down Test Suite");
        calculator = null;
    }
}
