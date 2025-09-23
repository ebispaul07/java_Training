package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddPositiveNumbers() {
        int result = calc.add(5, 3);
        Assert.assertEquals(result, 8, "5 + 3 should equal 8");
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = calc.add(-2, -3);
        Assert.assertEquals(result, -5, "-2 + -3 should equal -5");
    }

    // ❌ This one will FAIL on purpose
    @Test
    public void testFailingCase() {
        int result = calc.add(2, 2);
        Assert.assertEquals(result, 4, "2 + 2 should equal 5 (wrong on purpose!)");
    }
}
