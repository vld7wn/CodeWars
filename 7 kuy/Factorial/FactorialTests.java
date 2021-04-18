package Factorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FactorialTests {

    private Factorial fact;

    @Before
    public void initFactorial() {
        fact = new Factorial();
    }

    @After
    public void afterFactorial() {
        fact = null;
    }

    @Test
    public void test_factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void test_factorial1() {
        assertEquals(1, fact.factorial(1));
    }

    @Test
    public void test_factorial2() {
        assertEquals(2, fact.factorial(2));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void test_factorial4() {
        assertEquals(24, fact.factorial(4));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, fact.factorial(5));
    }

    @Test
    public void test_factorial6() {
        assertEquals(720, fact.factorial(6));
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_negativeFactorial1() {
        fact.factorial(-1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_negativeFactorial2() {
        fact.factorial(-42);
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_littleBiggerThan12() {
        fact.factorial(13);
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_biggerThan12() {
        fact.factorial(42);
    }

    @Test
    public void test_allIntFactorials() {
        IntStream.range(0, 12).forEach(i -> assertEquals(factorial(i), fact.factorial(i)));
    }

    private int factorial(int x) {
        if (x < 0 || x > 12) throw new IllegalArgumentException();
        return IntStream.rangeClosed(1, x).reduce(1, (a, b) -> a * b);
    }

}