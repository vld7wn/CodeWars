package CatGogYear;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ExampleTest {
    @Test
    public void one() {
        assertArrayEquals(new int[]{1,15,15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24}, Dinglemouse.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, Dinglemouse.humanYearsCatYearsDogYears(10));
    }

    // ======================================================

    private static class DinglemouseAnswer20180123 {
        static int[] humanYearsCatYearsDogYears(final int h) {
            return new int[]{h, h==1 ? 15 : h==2 ? 24 : 24+4*(h-2), h==1 ? 15 : h==2 ? 24 : 24+5*(h-2)};
        }
    }

    @Test
    public void random() {
        for (int r = 0; r < 100; r++) {
            final int humanYears = (int)(Math.random() * 25) + 1;
            final int[] expected = DinglemouseAnswer20180123.humanYearsCatYearsDogYears(humanYears);
            final int[] actual = Dinglemouse.humanYearsCatYearsDogYears(humanYears);
            System.out.println(String.format("Random test %d: human years %d => %s", r+1, humanYears, Arrays.toString(expected)));
            assertArrayEquals(expected, actual);
        }
    }
}
