package MilesPerGallonToKilometersPerLiter;

import org.junit.Test;
import java.math.BigDecimal;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class TestConverter {

    private static int NUM_RANDOM_TESTS = 40;
    private static int MAX_MPG = 5000;
    private static float KM_PER_MILE = 1.609344f;
    private static float LITRES_PER_GALLON = 4.54609188f;


    @Test
    public void test1() {
        assertEquals(3.54f, Converter.mpgToKPM(10), 0.001f);
    }

    @Test
    public void test2() {
        assertEquals(7.08f, Converter.mpgToKPM(20), 0.001f);
    }

    @Test
    public void test3() {
        assertEquals(10.62f, Converter.mpgToKPM(30), 0.001f);
    }

    @Test
    public void test4() {
        assertEquals(8.50f, Converter.mpgToKPM(24), 0.001f);
    }

    @Test
    public void test5() {
        assertEquals(12.74f, Converter.mpgToKPM(36), 0.001f);
    }

    @Test
    public void testRandoms() {
        Random random = new Random();
        for(int i = 0; i < NUM_RANDOM_TESTS; i++) {
            int mpg = random.nextInt(MAX_MPG);
            assertEquals("Testing where MPG = " + mpg, solution(mpg), Converter.mpgToKPM(mpg), 0.001f);
        }
    }

    private float solution(final float mpg) {
        return new BigDecimal(mpg * KM_PER_MILE / LITRES_PER_GALLON).setScale(2,BigDecimal.ROUND_HALF_UP).floatValue();
    }
}