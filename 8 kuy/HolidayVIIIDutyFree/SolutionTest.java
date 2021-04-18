package HolidayVIIIDutyFree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;
// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void fixedTests() {
        assertEquals(166, Kata.dutyFree(12,50,1000));
        assertEquals(294, Kata.dutyFree(17,10,500));
        assertEquals(357, Kata.dutyFree(24,35,3000));
        assertEquals(20, Kata.dutyFree(1400,35,10000));
        assertEquals(38, Kata.dutyFree(700,26,7000));
    }

    @Test
    public void randomTests() {
        int normPrice;
        int discount;
        int hol;
        Random r = new Random();
        for(int i = 0;i<100;i++){
            normPrice = r.nextInt(2500)+1;
            discount = r.nextInt(95)+1;
            hol = r.nextInt(11000)+100;
            assertEquals(dutyFree(normPrice,discount,hol),Kata.dutyFree(normPrice,discount,hol));
        }
    }

    public static int dutyFree(int normPrice, int discount, int hol) {

        return hol * 100 / normPrice / discount;

    }
}
