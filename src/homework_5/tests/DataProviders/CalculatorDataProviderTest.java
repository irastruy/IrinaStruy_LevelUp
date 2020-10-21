package homework_5.tests.DataProviders;

import org.testng.annotations.DataProvider;

public class CalculatorDataProviderTest {

    @DataProvider
    public Object[][] addDoubleDataProvider() {
        return new Object[][] {
                {8.0, 5.0, 13.0},
                {-6.76, 3.98, -2.78},
                {0.0, 9999999.675, 9999999.675}
        };
    }

    @DataProvider
    public Object[][] addLongDataProvider() {
        return new Object[][] {
                {99, 6, 105},
                {-50, 5, -45},
                {0, 9999999, 9999999}
        };
    }

    @DataProvider
    public Object[][] divideDoubleDataProvider() {
        return new Object[][] {
                {8.0, 4.0, 2.0},
                {-6.76, 3.98, -1.6984924623115},
                {0.0, 9999999.675, 0.0}
        };
    }

    @DataProvider
    public Object[][] divideLongDataProvider() {
        return new Object[][] {
                {99, 6, 16.5},
                {-50, 5, -10},
                {0, 9999999, 0}
        };
    }

    @DataProvider
    public Object[][] multiplyDoubleDataProvider() {
        return new Object[][] {
                {8.0, 4.0, 32.0},
                {-6.76, 3.98, -26.9048},
                {0.0, 9999999.675, 0.0}
        };
    }

    @DataProvider
    public Object[][] multiplyLongDataProvider() {
        return new Object[][] {
                {99, 6, 594},
                {-50, 5, -250},
                {0, 9999999, 0}
        };
    }

    @DataProvider
    public Object[][] subtractDoubleDataProvider() {
        return new Object[][] {
                {8.0, 4.0, 4.0},
                {-6.76, 3.98, -10.74},
                {0.0, 9999999.675, -9999999.675}
        };
    }

    @DataProvider
    public Object[][] subtractLongDataProvider() {
        return new Object[][] {
                {99, 6, 93},
                {-50, 5, -55},
                {0, 9999999, -9999999}
        };
    }

    @DataProvider
    public Object[][] powerDataProvider() {
        return new Object[][] {
                {6.34, 3.78, 1076.2109209912198},
                {-5.8, -3, -0.005125261388330806},
                {999.8, 0, 1}
        };
    }

    @DataProvider
    public Object[][] sqrtDataProvider() {
        return new Object[][] {
                {56.9, 7.543208866258443993},
                {15.6, 3.9496835316262998},
                {9.0, 3.0}
        };
    }

    @DataProvider
    public Object[][] tgDataProvider() {
        return new Object[][] {
                {99, -6.31375151467504},
                {10, 0.176326980708},
                {12, 0.21255656167002}
        };
    }

    @DataProvider
    public Object[][] ctgDataProvider() {
        return new Object[][] {
                {99, -0.158384440},
                {10, 5.6712818196},
                {12, 4.7046301094}
        };
    }

    @DataProvider
    public Object[][] cosDataProvider() {
        return new Object[][] {
                {99, -0.1564344650},
                {10, 0.9848077530122},
                {12, 0.97814760073}
        };
    }

    @DataProvider
    public Object[][] sinDataProvider() {
        return new Object[][] {
                {99, 0.9876883405},
                {10, 0.17364817766},
                {12, 0.20791169081}
        };
    }

    @DataProvider
    public Object[][] isPositiveDataProvider() {
        return new Object[][] {
                {99, true},
                {-10, false},
                {0, false}
        };
    }

    @DataProvider
    public Object[][] isNegativeDataProvider() {
        return new Object[][] {
                {99, false},
                {-10, true},
                {0, false}
        };
    }





}
